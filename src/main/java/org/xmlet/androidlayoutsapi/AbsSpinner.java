package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AbsSpinner<Z extends Element> implements CustomAttributeGroup<AbsSpinner<Z>, Z>, TextGroup<AbsSpinner<Z>, Z>, AdapterViewHierarchyInterface<AbsSpinner<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AbsSpinner(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAbsSpinner(this);
   }

   public AbsSpinner(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAbsSpinner(this);
   }

   protected AbsSpinner(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAbsSpinner(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAbsSpinner(this);
      return this.parent;
   }

   public final AbsSpinner<Z> dynamic(Consumer<AbsSpinner<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AbsSpinner<Z> of(Consumer<AbsSpinner<Z>> consumer) {
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
      return "absSpinner";
   }

   public final AbsSpinner<Z> self() {
      return this;
   }

   public final AbsSpinner<Z> attrEntries(String attrEntries) {
      this.visitor.visitAttributeEntries(attrEntries);
      return this;
   }
}
