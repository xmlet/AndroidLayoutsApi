package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ListView<Z extends Element> implements CustomAttributeGroup<ListView<Z>, Z>, TextGroup<ListView<Z>, Z>, AbsListViewHierarchyInterface<ListView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ListView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementListView(this);
   }

   public ListView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementListView(this);
   }

   protected ListView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementListView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentListView(this);
      return this.parent;
   }

   public final ListView<Z> dynamic(Consumer<ListView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ListView<Z> of(Consumer<ListView<Z>> consumer) {
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
      return "listView";
   }

   public final ListView<Z> self() {
      return this;
   }

   public final ListView<Z> attrDivider(String attrDivider) {
      this.visitor.visitAttributeDivider(attrDivider);
      return this;
   }

   public final ListView<Z> attrDividerHeight(String attrDividerHeight) {
      this.visitor.visitAttributeDividerHeight(attrDividerHeight);
      return this;
   }

   public final ListView<Z> attrEntries(String attrEntries) {
      this.visitor.visitAttributeEntries(attrEntries);
      return this;
   }

   public final ListView<Z> attrFooterDividersEnabled(String attrFooterDividersEnabled) {
      this.visitor.visitAttributeFooterDividersEnabled(attrFooterDividersEnabled);
      return this;
   }

   public final ListView<Z> attrHeaderDividersEnabled(String attrHeaderDividersEnabled) {
      this.visitor.visitAttributeHeaderDividersEnabled(attrHeaderDividersEnabled);
      return this;
   }

   public final ListView<Z> attrOverScrollFooter(String attrOverScrollFooter) {
      this.visitor.visitAttributeOverScrollFooter(attrOverScrollFooter);
      return this;
   }

   public final ListView<Z> attrOverScrollHeader(String attrOverScrollHeader) {
      this.visitor.visitAttributeOverScrollHeader(attrOverScrollHeader);
      return this;
   }
}
