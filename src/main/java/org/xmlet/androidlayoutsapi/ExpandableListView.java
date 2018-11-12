package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ExpandableListView<Z extends Element> implements CustomAttributeGroup<ExpandableListView<Z>, Z>, TextGroup<ExpandableListView<Z>, Z>, ListViewHierarchyInterface<ExpandableListView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ExpandableListView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementExpandableListView(this);
   }

   public ExpandableListView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementExpandableListView(this);
   }

   protected ExpandableListView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementExpandableListView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentExpandableListView(this);
      return this.parent;
   }

   public final ExpandableListView<Z> dynamic(Consumer<ExpandableListView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ExpandableListView<Z> of(Consumer<ExpandableListView<Z>> consumer) {
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
      return "expandableListView";
   }

   public final ExpandableListView<Z> self() {
      return this;
   }

   public final ExpandableListView<Z> attrChildDivider(String attrChildDivider) {
      this.visitor.visitAttributeChildDivider(attrChildDivider);
      return this;
   }

   public final ExpandableListView<Z> attrChildIndicator(String attrChildIndicator) {
      this.visitor.visitAttributeChildIndicator(attrChildIndicator);
      return this;
   }

   public final ExpandableListView<Z> attrChildIndicatorLeft(String attrChildIndicatorLeft) {
      this.visitor.visitAttributeChildIndicatorLeft(attrChildIndicatorLeft);
      return this;
   }

   public final ExpandableListView<Z> attrChildIndicatorRight(String attrChildIndicatorRight) {
      this.visitor.visitAttributeChildIndicatorRight(attrChildIndicatorRight);
      return this;
   }

   public final ExpandableListView<Z> attrGroupIndicator(String attrGroupIndicator) {
      this.visitor.visitAttributeGroupIndicator(attrGroupIndicator);
      return this;
   }

   public final ExpandableListView<Z> attrIndicatorLeft(String attrIndicatorLeft) {
      this.visitor.visitAttributeIndicatorLeft(attrIndicatorLeft);
      return this;
   }

   public final ExpandableListView<Z> attrIndicatorRight(String attrIndicatorRight) {
      this.visitor.visitAttributeIndicatorRight(attrIndicatorRight);
      return this;
   }
}
