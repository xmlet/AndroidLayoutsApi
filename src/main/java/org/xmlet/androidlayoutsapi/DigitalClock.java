package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class DigitalClock<Z extends Element> implements CustomAttributeGroup<DigitalClock<Z>, Z>, TextGroup<DigitalClock<Z>, Z>, TextViewHierarchyInterface<DigitalClock<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public DigitalClock(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDigitalClock(this);
   }

   public DigitalClock(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDigitalClock(this);
   }

   protected DigitalClock(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDigitalClock(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDigitalClock(this);
      return this.parent;
   }

   public final DigitalClock<Z> dynamic(Consumer<DigitalClock<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final DigitalClock<Z> of(Consumer<DigitalClock<Z>> consumer) {
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
      return "digitalClock";
   }

   public final DigitalClock<Z> self() {
      return this;
   }
}
