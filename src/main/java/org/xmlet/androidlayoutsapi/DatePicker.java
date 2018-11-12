package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class DatePicker<Z extends Element> implements CustomAttributeGroup<DatePicker<Z>, Z>, TextGroup<DatePicker<Z>, Z>, FrameLayoutHierarchyInterface<DatePicker<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public DatePicker(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDatePicker(this);
   }

   public DatePicker(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDatePicker(this);
   }

   protected DatePicker(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDatePicker(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDatePicker(this);
      return this.parent;
   }

   public final DatePicker<Z> dynamic(Consumer<DatePicker<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final DatePicker<Z> of(Consumer<DatePicker<Z>> consumer) {
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
      return "datePicker";
   }

   public final DatePicker<Z> self() {
      return this;
   }
}
