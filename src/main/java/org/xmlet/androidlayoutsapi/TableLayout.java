package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TableLayout<Z extends Element> implements CustomAttributeGroup<TableLayout<Z>, Z>, TextGroup<TableLayout<Z>, Z>, LinearLayoutHierarchyInterface<TableLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TableLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTableLayout(this);
   }

   public TableLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTableLayout(this);
   }

   protected TableLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTableLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTableLayout(this);
      return this.parent;
   }

   public final TableLayout<Z> dynamic(Consumer<TableLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TableLayout<Z> of(Consumer<TableLayout<Z>> consumer) {
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
      return "tableLayout";
   }

   public final TableLayout<Z> self() {
      return this;
   }

   public final TableLayout<Z> attrCollapseColumns(String attrCollapseColumns) {
      this.visitor.visitAttributeCollapseColumns(attrCollapseColumns);
      return this;
   }

   public final TableLayout<Z> attrShrinkColumns(String attrShrinkColumns) {
      this.visitor.visitAttributeShrinkColumns(attrShrinkColumns);
      return this;
   }

   public final TableLayout<Z> attrStretchColumns(String attrStretchColumns) {
      this.visitor.visitAttributeStretchColumns(attrStretchColumns);
      return this;
   }
}
