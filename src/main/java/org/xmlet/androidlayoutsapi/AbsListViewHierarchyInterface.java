package org.xmlet.androidlayoutsapi;

public interface AbsListViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, AdapterViewHierarchyInterface<T, Z> {
   default T attrCacheColorHint(String attrCacheColorHint) {
      this.getVisitor().visitAttributeCacheColorHint(attrCacheColorHint);
      return this.self();
   }

   default T attrChoiceMode(String attrChoiceMode) {
      this.getVisitor().visitAttributeChoiceMode(attrChoiceMode);
      return this.self();
   }

   default T attrDrawSelectorOnTop(String attrDrawSelectorOnTop) {
      this.getVisitor().visitAttributeDrawSelectorOnTop(attrDrawSelectorOnTop);
      return this.self();
   }

   default T attrFastScrollAlwaysVisible(String attrFastScrollAlwaysVisible) {
      this.getVisitor().visitAttributeFastScrollAlwaysVisible(attrFastScrollAlwaysVisible);
      return this.self();
   }

   default T attrFastScrollEnabled(String attrFastScrollEnabled) {
      this.getVisitor().visitAttributeFastScrollEnabled(attrFastScrollEnabled);
      return this.self();
   }

   default T attrListSelector(String attrListSelector) {
      this.getVisitor().visitAttributeListSelector(attrListSelector);
      return this.self();
   }

   default T attrScrollingCache(String attrScrollingCache) {
      this.getVisitor().visitAttributeScrollingCache(attrScrollingCache);
      return this.self();
   }

   default T attrSmoothScrollbar(String attrSmoothScrollbar) {
      this.getVisitor().visitAttributeSmoothScrollbar(attrSmoothScrollbar);
      return this.self();
   }

   default T attrStackFromBottom(String attrStackFromBottom) {
      this.getVisitor().visitAttributeStackFromBottom(attrStackFromBottom);
      return this.self();
   }

   default T attrTextFilterEnabled(String attrTextFilterEnabled) {
      this.getVisitor().visitAttributeTextFilterEnabled(attrTextFilterEnabled);
      return this.self();
   }

   default T attrTranscriptMode(String attrTranscriptMode) {
      this.getVisitor().visitAttributeTranscriptMode(attrTranscriptMode);
      return this.self();
   }
}
