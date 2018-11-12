package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AdapterViewAnimator<Z extends Element> implements CustomAttributeGroup<AdapterViewAnimator<Z>, Z>, TextGroup<AdapterViewAnimator<Z>, Z>, AdapterViewHierarchyInterface<AdapterViewAnimator<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AdapterViewAnimator(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAdapterViewAnimator(this);
   }

   public AdapterViewAnimator(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAdapterViewAnimator(this);
   }

   protected AdapterViewAnimator(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAdapterViewAnimator(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAdapterViewAnimator(this);
      return this.parent;
   }

   public final AdapterViewAnimator<Z> dynamic(Consumer<AdapterViewAnimator<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AdapterViewAnimator<Z> of(Consumer<AdapterViewAnimator<Z>> consumer) {
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
      return "adapterViewAnimator";
   }

   public final AdapterViewAnimator<Z> self() {
      return this;
   }

   public final AdapterViewAnimator<Z> attrAnimateFirstView(String attrAnimateFirstView) {
      this.visitor.visitAttributeAnimateFirstView(attrAnimateFirstView);
      return this;
   }

   public final AdapterViewAnimator<Z> attrInAnimation(String attrInAnimation) {
      this.visitor.visitAttributeInAnimation(attrInAnimation);
      return this;
   }

   public final AdapterViewAnimator<Z> attrLoopViews(String attrLoopViews) {
      this.visitor.visitAttributeLoopViews(attrLoopViews);
      return this;
   }

   public final AdapterViewAnimator<Z> attrOutAnimation(String attrOutAnimation) {
      this.visitor.visitAttributeOutAnimation(attrOutAnimation);
      return this;
   }
}
