package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TabWidget<Z extends Element> implements CustomAttributeGroup<TabWidget<Z>, Z>, TextGroup<TabWidget<Z>, Z>, LinearLayoutHierarchyInterface<TabWidget<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TabWidget(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTabWidget(this);
   }

   public TabWidget(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTabWidget(this);
   }

   protected TabWidget(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTabWidget(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTabWidget(this);
      return this.parent;
   }

   public final TabWidget<Z> dynamic(Consumer<TabWidget<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TabWidget<Z> of(Consumer<TabWidget<Z>> consumer) {
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
      return "tabWidget";
   }

   public final TabWidget<Z> self() {
      return this;
   }

   public final TabWidget<Z> attrDivider(String attrDivider) {
      this.visitor.visitAttributeDivider(attrDivider);
      return this;
   }

   public final TabWidget<Z> attrTabStripEnabled(String attrTabStripEnabled) {
      this.visitor.visitAttributeTabStripEnabled(attrTabStripEnabled);
      return this;
   }

   public final TabWidget<Z> attrTabStripLeft(String attrTabStripLeft) {
      this.visitor.visitAttributeTabStripLeft(attrTabStripLeft);
      return this;
   }

   public final TabWidget<Z> attrTabStripRight(String attrTabStripRight) {
      this.visitor.visitAttributeTabStripRight(attrTabStripRight);
      return this;
   }
}
