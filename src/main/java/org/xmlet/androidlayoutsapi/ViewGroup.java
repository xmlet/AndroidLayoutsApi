package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ViewGroup<Z extends Element> implements CustomAttributeGroup<ViewGroup<Z>, Z>, GroupAndroidViewChoice<ViewGroup<Z>, Z>, ViewHierarchyInterface<ViewGroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ViewGroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementViewGroup(this);
   }

   public ViewGroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementViewGroup(this);
   }

   protected ViewGroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementViewGroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentViewGroup(this);
      return this.parent;
   }

   public final ViewGroup<Z> dynamic(Consumer<ViewGroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ViewGroup<Z> of(Consumer<ViewGroup<Z>> consumer) {
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
      return "viewGroup";
   }

   public final ViewGroup<Z> self() {
      return this;
   }

   public final ViewGroup<Z> attrAddStatesFromChildren(Boolean attrAddStatesFromChildren) {
      this.visitor.visitAttributeAddStatesFromChildren(attrAddStatesFromChildren.toString());
      return this;
   }

   public final ViewGroup<Z> attrAlwaysDrawnWithCache(Boolean attrAlwaysDrawnWithCache) {
      this.visitor.visitAttributeAlwaysDrawnWithCache(attrAlwaysDrawnWithCache.toString());
      return this;
   }

   public final ViewGroup<Z> attrAnimateLayoutChanges(String attrAnimateLayoutChanges) {
      this.visitor.visitAttributeAnimateLayoutChanges(attrAnimateLayoutChanges);
      return this;
   }

   public final ViewGroup<Z> attrAnimationCache(Boolean attrAnimationCache) {
      this.visitor.visitAttributeAnimationCache(attrAnimationCache.toString());
      return this;
   }

   public final ViewGroup<Z> attrClipChildren(Boolean attrClipChildren) {
      this.visitor.visitAttributeClipChildren(attrClipChildren.toString());
      return this;
   }

   public final ViewGroup<Z> attrClipToPadding(Boolean attrClipToPadding) {
      this.visitor.visitAttributeClipToPadding(attrClipToPadding.toString());
      return this;
   }

   public final ViewGroup<Z> attrDescendantFocusability(EnumDescendantFocusabilityViewGroup attrDescendantFocusability) {
      this.visitor.visitAttributeDescendantFocusability(attrDescendantFocusability.getValue());
      return this;
   }

   public final ViewGroup<Z> attrLayoutAnimation(String attrLayoutAnimation) {
      this.visitor.visitAttributeLayoutAnimation(attrLayoutAnimation);
      return this;
   }

   public final ViewGroup<Z> attrPersistentDrawingCache(EnumPersistentDrawingCacheViewGroup attrPersistentDrawingCache) {
      this.visitor.visitAttributePersistentDrawingCache(attrPersistentDrawingCache.getValue());
      return this;
   }

   public final ViewGroup<Z> attrSplitMotionEvents(String attrSplitMotionEvents) {
      this.visitor.visitAttributeSplitMotionEvents(attrSplitMotionEvents);
      return this;
   }
}
