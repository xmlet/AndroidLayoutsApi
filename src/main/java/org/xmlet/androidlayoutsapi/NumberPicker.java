package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class NumberPicker<Z extends Element> implements CustomAttributeGroup<NumberPicker<Z>, Z>, TextGroup<NumberPicker<Z>, Z>, LinearLayoutHierarchyInterface<NumberPicker<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NumberPicker(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNumberPicker(this);
   }

   public NumberPicker(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNumberPicker(this);
   }

   protected NumberPicker(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNumberPicker(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNumberPicker(this);
      return this.parent;
   }

   public final NumberPicker<Z> dynamic(Consumer<NumberPicker<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NumberPicker<Z> of(Consumer<NumberPicker<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "numberPicker";
   }

   public final NumberPicker<Z> self() {
      return this;
   }
}
