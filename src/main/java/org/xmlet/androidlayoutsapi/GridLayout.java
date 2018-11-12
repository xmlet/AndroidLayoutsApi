package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class GridLayout<Z extends Element> implements CustomAttributeGroup<GridLayout<Z>, Z>, TextGroup<GridLayout<Z>, Z>, ViewGroupHierarchyInterface<GridLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public GridLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGridLayout(this);
   }

   public GridLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGridLayout(this);
   }

   protected GridLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGridLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGridLayout(this);
      return this.parent;
   }

   public final GridLayout<Z> dynamic(Consumer<GridLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final GridLayout<Z> of(Consumer<GridLayout<Z>> consumer) {
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
      return "gridLayout";
   }

   public final GridLayout<Z> self() {
      return this;
   }

   public final GridLayout<Z> attrAlignmentMode(String attrAlignmentMode) {
      this.visitor.visitAttributeAlignmentMode(attrAlignmentMode);
      return this;
   }

   public final GridLayout<Z> attrColumnCount(String attrColumnCount) {
      this.visitor.visitAttributeColumnCount(attrColumnCount);
      return this;
   }

   public final GridLayout<Z> attrColumnOrderPreserved(String attrColumnOrderPreserved) {
      this.visitor.visitAttributeColumnOrderPreserved(attrColumnOrderPreserved);
      return this;
   }

   public final GridLayout<Z> attrOrientation(EnumOrientationGridLayout attrOrientation) {
      this.visitor.visitAttributeOrientation(attrOrientation.getValue());
      return this;
   }

   public final GridLayout<Z> attrRowCount(String attrRowCount) {
      this.visitor.visitAttributeRowCount(attrRowCount);
      return this;
   }

   public final GridLayout<Z> attrRowOrderPreserved(String attrRowOrderPreserved) {
      this.visitor.visitAttributeRowOrderPreserved(attrRowOrderPreserved);
      return this;
   }

   public final GridLayout<Z> attrUseDefaultMargins(String attrUseDefaultMargins) {
      this.visitor.visitAttributeUseDefaultMargins(attrUseDefaultMargins);
      return this;
   }
}
