package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TimePicker<Z extends Element> implements CustomAttributeGroup<TimePicker<Z>, Z>, TextGroup<TimePicker<Z>, Z>, FrameLayoutHierarchyInterface<TimePicker<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TimePicker(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTimePicker(this);
   }

   public TimePicker(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTimePicker(this);
   }

   protected TimePicker(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTimePicker(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTimePicker(this);
      return this.parent;
   }

   public final TimePicker<Z> dynamic(Consumer<TimePicker<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TimePicker<Z> of(Consumer<TimePicker<Z>> consumer) {
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
      return "timePicker";
   }

   public final TimePicker<Z> self() {
      return this;
   }
}
