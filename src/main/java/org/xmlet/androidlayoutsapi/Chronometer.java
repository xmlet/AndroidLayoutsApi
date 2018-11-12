package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Chronometer<Z extends Element> implements CustomAttributeGroup<Chronometer<Z>, Z>, TextGroup<Chronometer<Z>, Z>, TextViewHierarchyInterface<Chronometer<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Chronometer(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementChronometer(this);
   }

   public Chronometer(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementChronometer(this);
   }

   protected Chronometer(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementChronometer(this);
      }

   }

   public Z __() {
      this.visitor.visitParentChronometer(this);
      return this.parent;
   }

   public final Chronometer<Z> dynamic(Consumer<Chronometer<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Chronometer<Z> of(Consumer<Chronometer<Z>> consumer) {
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
      return "chronometer";
   }

   public final Chronometer<Z> self() {
      return this;
   }

   public final Chronometer<Z> attrFormat(String attrFormat) {
      this.visitor.visitAttributeFormat(attrFormat);
      return this;
   }
}
