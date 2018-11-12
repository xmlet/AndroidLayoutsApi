package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AnalogClock<Z extends Element> implements CustomAttributeGroup<AnalogClock<Z>, Z>, TextGroup<AnalogClock<Z>, Z>, ViewHierarchyInterface<AnalogClock<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnalogClock(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnalogClock(this);
   }

   public AnalogClock(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnalogClock(this);
   }

   protected AnalogClock(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnalogClock(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnalogClock(this);
      return this.parent;
   }

   public final AnalogClock<Z> dynamic(Consumer<AnalogClock<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnalogClock<Z> of(Consumer<AnalogClock<Z>> consumer) {
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
      return "analogClock";
   }

   public final AnalogClock<Z> self() {
      return this;
   }

   public final AnalogClock<Z> attrDial(String attrDial) {
      this.visitor.visitAttributeDial(attrDial);
      return this;
   }

   public final AnalogClock<Z> attrHandHour(String attrHandHour) {
      this.visitor.visitAttributeHandHour(attrHandHour);
      return this;
   }

   public final AnalogClock<Z> attrHandMinute(String attrHandMinute) {
      this.visitor.visitAttributeHandMinute(attrHandMinute);
      return this;
   }
}
