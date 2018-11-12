package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class CompoundButton<Z extends Element> implements CustomAttributeGroup<CompoundButton<Z>, Z>, TextGroup<CompoundButton<Z>, Z>, ButtonHierarchyInterface<CompoundButton<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CompoundButton(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCompoundButton(this);
   }

   public CompoundButton(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCompoundButton(this);
   }

   protected CompoundButton(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCompoundButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCompoundButton(this);
      return this.parent;
   }

   public final CompoundButton<Z> dynamic(Consumer<CompoundButton<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CompoundButton<Z> of(Consumer<CompoundButton<Z>> consumer) {
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
      return "compoundButton";
   }

   public final CompoundButton<Z> self() {
      return this;
   }

   public final CompoundButton<Z> attrButton(String attrButton) {
      this.visitor.visitAttributeButton(attrButton);
      return this;
   }

   public final CompoundButton<Z> attrChecked(String attrChecked) {
      this.visitor.visitAttributeChecked(attrChecked);
      return this;
   }
}
