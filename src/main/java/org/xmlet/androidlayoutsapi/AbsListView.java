package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AbsListView<Z extends Element> implements CustomAttributeGroup<AbsListView<Z>, Z>, TextGroup<AbsListView<Z>, Z>, AdapterViewHierarchyInterface<AbsListView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AbsListView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAbsListView(this);
   }

   public AbsListView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAbsListView(this);
   }

   protected AbsListView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAbsListView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAbsListView(this);
      return this.parent;
   }

   public final AbsListView<Z> dynamic(Consumer<AbsListView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AbsListView<Z> of(Consumer<AbsListView<Z>> consumer) {
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
      return "absListView";
   }

   public final AbsListView<Z> self() {
      return this;
   }

   public final AbsListView<Z> attrCacheColorHint(String attrCacheColorHint) {
      this.visitor.visitAttributeCacheColorHint(attrCacheColorHint);
      return this;
   }

   public final AbsListView<Z> attrChoiceMode(String attrChoiceMode) {
      this.visitor.visitAttributeChoiceMode(attrChoiceMode);
      return this;
   }

   public final AbsListView<Z> attrDrawSelectorOnTop(String attrDrawSelectorOnTop) {
      this.visitor.visitAttributeDrawSelectorOnTop(attrDrawSelectorOnTop);
      return this;
   }

   public final AbsListView<Z> attrFastScrollAlwaysVisible(String attrFastScrollAlwaysVisible) {
      this.visitor.visitAttributeFastScrollAlwaysVisible(attrFastScrollAlwaysVisible);
      return this;
   }

   public final AbsListView<Z> attrFastScrollEnabled(String attrFastScrollEnabled) {
      this.visitor.visitAttributeFastScrollEnabled(attrFastScrollEnabled);
      return this;
   }

   public final AbsListView<Z> attrListSelector(String attrListSelector) {
      this.visitor.visitAttributeListSelector(attrListSelector);
      return this;
   }

   public final AbsListView<Z> attrScrollingCache(String attrScrollingCache) {
      this.visitor.visitAttributeScrollingCache(attrScrollingCache);
      return this;
   }

   public final AbsListView<Z> attrSmoothScrollbar(String attrSmoothScrollbar) {
      this.visitor.visitAttributeSmoothScrollbar(attrSmoothScrollbar);
      return this;
   }

   public final AbsListView<Z> attrStackFromBottom(String attrStackFromBottom) {
      this.visitor.visitAttributeStackFromBottom(attrStackFromBottom);
      return this;
   }

   public final AbsListView<Z> attrTextFilterEnabled(String attrTextFilterEnabled) {
      this.visitor.visitAttributeTextFilterEnabled(attrTextFilterEnabled);
      return this;
   }

   public final AbsListView<Z> attrTranscriptMode(String attrTranscriptMode) {
      this.visitor.visitAttributeTranscriptMode(attrTranscriptMode);
      return this;
   }
}
