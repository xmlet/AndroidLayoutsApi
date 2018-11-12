package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ViewFlipper<Z extends Element> implements CustomAttributeGroup<ViewFlipper<Z>, Z>, TextGroup<ViewFlipper<Z>, Z>, ViewAnimatorHierarchyInterface<ViewFlipper<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ViewFlipper(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementViewFlipper(this);
   }

   public ViewFlipper(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementViewFlipper(this);
   }

   protected ViewFlipper(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementViewFlipper(this);
      }

   }

   public Z __() {
      this.visitor.visitParentViewFlipper(this);
      return this.parent;
   }

   public final ViewFlipper<Z> dynamic(Consumer<ViewFlipper<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ViewFlipper<Z> of(Consumer<ViewFlipper<Z>> consumer) {
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
      return "viewFlipper";
   }

   public final ViewFlipper<Z> self() {
      return this;
   }

   public final ViewFlipper<Z> attrAutoStart(String attrAutoStart) {
      this.visitor.visitAttributeAutoStart(attrAutoStart);
      return this;
   }

   public final ViewFlipper<Z> attrFlipInterval(String attrFlipInterval) {
      this.visitor.visitAttributeFlipInterval(attrFlipInterval);
      return this;
   }
}
