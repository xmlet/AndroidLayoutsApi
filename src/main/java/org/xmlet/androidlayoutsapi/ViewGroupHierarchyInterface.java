package org.xmlet.androidlayoutsapi;

public interface ViewGroupHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, GroupAndroidViewChoice<T, Z>, ViewHierarchyInterface<T, Z> {
   default T attrAddStatesFromChildren(Boolean attrAddStatesFromChildren) {
      this.getVisitor().visitAttributeAddStatesFromChildren(attrAddStatesFromChildren.toString());
      return this.self();
   }

   default T attrAlwaysDrawnWithCache(Boolean attrAlwaysDrawnWithCache) {
      this.getVisitor().visitAttributeAlwaysDrawnWithCache(attrAlwaysDrawnWithCache.toString());
      return this.self();
   }

   default T attrAnimateLayoutChanges(String attrAnimateLayoutChanges) {
      this.getVisitor().visitAttributeAnimateLayoutChanges(attrAnimateLayoutChanges);
      return this.self();
   }

   default T attrAnimationCache(Boolean attrAnimationCache) {
      this.getVisitor().visitAttributeAnimationCache(attrAnimationCache.toString());
      return this.self();
   }

   default T attrClipChildren(Boolean attrClipChildren) {
      this.getVisitor().visitAttributeClipChildren(attrClipChildren.toString());
      return this.self();
   }

   default T attrClipToPadding(Boolean attrClipToPadding) {
      this.getVisitor().visitAttributeClipToPadding(attrClipToPadding.toString());
      return this.self();
   }

   default T attrDescendantFocusability(EnumDescendantFocusabilityViewGroup attrDescendantFocusability) {
      this.getVisitor().visitAttributeDescendantFocusability(attrDescendantFocusability.getValue());
      return this.self();
   }

   default T attrLayoutAnimation(String attrLayoutAnimation) {
      this.getVisitor().visitAttributeLayoutAnimation(attrLayoutAnimation);
      return this.self();
   }

   default T attrPersistentDrawingCache(EnumPersistentDrawingCacheViewGroup attrPersistentDrawingCache) {
      this.getVisitor().visitAttributePersistentDrawingCache(attrPersistentDrawingCache.getValue());
      return this.self();
   }

   default T attrSplitMotionEvents(String attrSplitMotionEvents) {
      this.getVisitor().visitAttributeSplitMotionEvents(attrSplitMotionEvents);
      return this.self();
   }
}
