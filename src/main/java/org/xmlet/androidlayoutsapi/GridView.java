package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class GridView<Z extends Element> implements CustomAttributeGroup<GridView<Z>, Z>, TextGroup<GridView<Z>, Z>, AbsListViewHierarchyInterface<GridView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public GridView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGridView(this);
   }

   public GridView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGridView(this);
   }

   protected GridView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGridView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGridView(this);
      return this.parent;
   }

   public final GridView<Z> dynamic(Consumer<GridView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final GridView<Z> of(Consumer<GridView<Z>> consumer) {
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
      return "gridView";
   }

   public final GridView<Z> self() {
      return this;
   }

   public final GridView<Z> attrColumnWidth(String attrColumnWidth) {
      this.visitor.visitAttributeColumnWidth(attrColumnWidth);
      return this;
   }

   public final GridView<Z> attrGravity(EnumGravityGridView attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final GridView<Z> attrHorizontalSpacing(String attrHorizontalSpacing) {
      this.visitor.visitAttributeHorizontalSpacing(attrHorizontalSpacing);
      return this;
   }

   public final GridView<Z> attrNumColumns(String attrNumColumns) {
      this.visitor.visitAttributeNumColumns(attrNumColumns);
      return this;
   }

   public final GridView<Z> attrStretchMode(String attrStretchMode) {
      this.visitor.visitAttributeStretchMode(attrStretchMode);
      return this;
   }

   public final GridView<Z> attrVerticalSpacing(String attrVerticalSpacing) {
      this.visitor.visitAttributeVerticalSpacing(attrVerticalSpacing);
      return this;
   }
}
