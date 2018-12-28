package org.polyjdbc.core.schema.model;

import org.polyjdbc.core.dialect.Dialect;

public class DoubleAttribute extends Attribute {

    public DoubleAttribute(Dialect dialect, String name) {
        super(dialect, name);
    }

    @Override
    protected String getTypeDefinition() {
        return dialect().types().doubleType();
    }

    public static class DoubleAttributeBuilder extends AttributeBuilder<DoubleAttributeBuilder, DoubleAttribute> {

        private DoubleAttributeBuilder(Dialect dialect, String name, RelationBuilder parent) {
            super(new DoubleAttribute(dialect, name), parent);
        }

        public static DoubleAttributeBuilder doubleAttr(Dialect dialect, String name, RelationBuilder parent) {
            return new DoubleAttributeBuilder(dialect, name, parent);
        }

        @Override
        protected DoubleAttributeBuilder self() {
            return this;
        }
    }
}
