package com.fego.transaction.specification;

import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThan;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.LessThan;
import net.kaczmarzyk.spring.data.jpa.domain.LessThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.NotEqual;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "createdAt", params = "createdAt.EQ", spec = Equal.class),
        @Spec(path = "createdAt", params = "createdAt.NE", spec = NotEqual.class),
        @Spec(path = "createdAt", params = "createdAt.LT", spec = LessThan.class),
        @Spec(path = "createdAt", params = "createdAt.LE", spec = LessThanOrEqual.class),
        @Spec(path = "createdAt", params = "createdAt.GT", spec = GreaterThan.class),
        @Spec(path = "createdAt", params = "createdAt.GE", spec = GreaterThanOrEqual.class),
        @Spec(path = "createdAt", params = {"createdAt.AF", "createdAt.BF"}, spec = Between.class)
})
public interface CreatedAtSpec<T> extends Specification<T> {
}