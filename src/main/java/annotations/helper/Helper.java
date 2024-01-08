package annotations.helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@MyAnnotation(name = "class level")
public class Helper {

  @MyAnnotation(name = "method level")
  void showAnnotations() {
    MyAnnotation myAnnotation = Helper.class.getAnnotation(MyAnnotation.class);
    System.out.println(myAnnotation.name());

    Helper.class.getDeclaredMethods()[0].getAnnotation(MyAnnotation.class);
  }

  public static void main(String[] args) {
    new Helper().showAnnotations();
    new Helper().findClassesInPackage(Helper.class.getPackageName());
  }

  /**
   * There are utilities like Reflections, ClassGraph, etc. to find classes in a package. But here
   * is some code only in Java to find classes in a package.
   *
   * @param packageName
   * @return
   */
  public static List<? extends Class> findClassesInPackage(String packageName) {
    InputStream is =
        Helper.class.getClassLoader().getResourceAsStream(packageName.replace(".", "/"));
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    try {
      return reader
          .lines()
          .filter(line -> line.endsWith(".class"))
          .map(line -> line.replace(".class", ""))
          .map(line -> packageName + "." + line)
          .map(
              className -> {
                try {
                  return Class.forName(className);
                } catch (ClassNotFoundException e) {
                  e.printStackTrace();
                }
                return null;
              })
          .toList();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
