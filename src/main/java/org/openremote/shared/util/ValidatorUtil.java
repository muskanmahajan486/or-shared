package org.openremote.shared.util;

import javax.validation.*;
import java.util.HashSet;
import java.util.Set;

public class ValidatorUtil {

    protected static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    public static Validator VALIDATOR = factory.getValidator();

    public static <T> void validateAndThrow(T object, String message, Class<?>... groups) {
        Set<ConstraintViolation<T>> validationErrors =
            ValidatorUtil.VALIDATOR.validate(object, groups);

        if (!validationErrors.isEmpty()) {
            throw new ConstraintViolationException(message, new HashSet<>(validationErrors));

        }
    }
}
