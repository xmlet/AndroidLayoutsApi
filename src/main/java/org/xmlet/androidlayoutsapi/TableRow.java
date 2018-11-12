package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TableRow<Z extends Element> implements CustomAttributeGroup<TableRow<Z>, Z>, TextGroup<TableRow<Z>, Z>, LinearLayoutHierarchyInterface<TableRow<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TableRow(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTableRow(this);
   }

   public TableRow(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTableRow(this);
   }

   protected TableRow(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTableRow(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTableRow(this);
      return this.parent;
   }

   public final TableRow<Z> dynamic(Consumer<TableRow<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TableRow<Z> of(Consumer<TableRow<Z>> consumer) {
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
      return "tableRow";
   }

   public final TableRow<Z> self() {
      return this;
   }
}
