package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ViewAnimator<Z extends Element> implements CustomAttributeGroup<ViewAnimator<Z>, Z>, TextGroup<ViewAnimator<Z>, Z>, FrameLayoutHierarchyInterface<ViewAnimator<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ViewAnimator(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementViewAnimator(this);
   }

   public ViewAnimator(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementViewAnimator(this);
   }

   protected ViewAnimator(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementViewAnimator(this);
      }

   }

   public Z __() {
      this.visitor.visitParentViewAnimator(this);
      return this.parent;
   }

   public final ViewAnimator<Z> dynamic(Consumer<ViewAnimator<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ViewAnimator<Z> of(Consumer<ViewAnimator<Z>> consumer) {
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
      return "viewAnimator";
   }

   public final ViewAnimator<Z> self() {
      return this;
   }

   public final ViewAnimator<Z> attrAnimateFirstView(String attrAnimateFirstView) {
      this.visitor.visitAttributeAnimateFirstView(attrAnimateFirstView);
      return this;
   }

   public final ViewAnimator<Z> attrInAnimation(String attrInAnimation) {
      this.visitor.visitAttributeInAnimation(attrInAnimation);
      return this;
   }

   public final ViewAnimator<Z> attrOutAnimation(String attrOutAnimation) {
      this.visitor.visitAttributeOutAnimation(attrOutAnimation);
      return this;
   }
}
