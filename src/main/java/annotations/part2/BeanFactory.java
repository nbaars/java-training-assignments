package annotations.part2;

import annotations.helper.Helper;
import java.util.List;
import java.util.Map;

public class BeanFactory {
  private Map<Class, Object> beanRegistry;

  public BeanFactory() {
    List<? extends Class> classesInPackage =
        Helper.findClassesInPackage(this.getClass().getPackageName());
    // TODO check if class is annotated with @EnableTiming if yes, create a proxy for that class and
    // put it in the map
  }

  public <T> T getBean(Class<T> clazz) {
    Object proxy = beanRegistry.get(clazz);
    return clazz.cast(proxy);
  }
}
