package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class SlidingDrawer<Z extends Element> implements CustomAttributeGroup<SlidingDrawer<Z>, Z>, TextGroup<SlidingDrawer<Z>, Z>, ViewGroupHierarchyInterface<SlidingDrawer<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SlidingDrawer(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSlidingDrawer(this);
   }

   public SlidingDrawer(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSlidingDrawer(this);
   }

   protected SlidingDrawer(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSlidingDrawer(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSlidingDrawer(this);
      return this.parent;
   }

   public final SlidingDrawer<Z> dynamic(Consumer<SlidingDrawer<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SlidingDrawer<Z> of(Consumer<SlidingDrawer<Z>> consumer) {
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
      return "slidingDrawer";
   }

   public final SlidingDrawer<Z> self() {
      return this;
   }

   public final SlidingDrawer<Z> attrAllowSingleTap(String attrAllowSingleTap) {
      this.visitor.visitAttributeAllowSingleTap(attrAllowSingleTap);
      return this;
   }

   public final SlidingDrawer<Z> attrAnimateOnClick(String attrAnimateOnClick) {
      this.visitor.visitAttributeAnimateOnClick(attrAnimateOnClick);
      return this;
   }

   public final SlidingDrawer<Z> attrBottomOffset(String attrBottomOffset) {
      this.visitor.visitAttributeBottomOffset(attrBottomOffset);
      return this;
   }

   public final SlidingDrawer<Z> attrContent(String attrContent) {
      this.visitor.visitAttributeContent(attrContent);
      return this;
   }

   public final SlidingDrawer<Z> attrHandle(String attrHandle) {
      this.visitor.visitAttributeHandle(attrHandle);
      return this;
   }

   public final SlidingDrawer<Z> attrOrientation(EnumOrientationSlidingDrawer attrOrientation) {
      this.visitor.visitAttributeOrientation(attrOrientation.getValue());
      return this;
   }

   public final SlidingDrawer<Z> attrTopOffset(String attrTopOffset) {
      this.visitor.visitAttributeTopOffset(attrTopOffset);
      return this;
   }
}
