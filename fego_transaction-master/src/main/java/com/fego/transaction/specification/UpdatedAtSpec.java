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
        @Spec(path = "updatedAt", params = "updatedAt.EQ", spec = Equal.class),
        @Spec(path = "updatedAt", params = "updatedAt.NE", spec = NotEqual.class),
        @Spec(path = "updatedAt", params = "updatedAt.LT", spec = LessThan.class),
        @Spec(path = "updatedAt", params = "updatedAt.LE", spec = LessThanOrEqual.class),
        @Spec(path = "updatedAt", params = "updatedAt.GT", spec = GreaterThan.class),
        @Spec(path = "updatedAt", params = "updatedAt.GE", spec = GreaterThanOrEqual.class),
        @Spec(path = "updatedAt", params = {"updatedAt.AF", "updatedAt.BF"}, spec = Between.class)
})
public interface UpdatedAtSpec<T> extends Specification<T> {
}
