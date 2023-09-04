package Lesson28;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckNameValidation {

    public void checkNameValidation(Object object) {
        checkIsNull(object);
        nameValidation(object);
    }

    private void checkIsNull(Object object) {
        if(Objects.isNull(object)){
            throw new CheckNameException("The person is null");
        }

        Class<?> aClass = object.getClass();
        if(!aClass.isAnnotationPresent(ClassToValidate.class)){
            throw new CheckNameException("Class is not marked for validation");
        }
    }

    private void nameValidation(Object object) {
        Class<?> aClass = object.getClass();
        Arrays.stream(aClass.getDeclaredFields()).forEach(
                field -> {field.setAccessible(true);
                    if (field.isAnnotationPresent(CheckName.class)) {
                        try {
                            String name = (String) field.get(object);
                            nameCheckValidation(name, field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }

    private void nameCheckValidation(String name, Field field) {
        if(name.matches("^[a-zA-Z]+$")) {
            System.out.println("Field name is valid");
        }else {
            System.out.println("Field name is not valid");
        }
    }



}
