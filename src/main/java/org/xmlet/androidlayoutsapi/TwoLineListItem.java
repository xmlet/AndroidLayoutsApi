package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TwoLineListItem<Z extends Element> implements CustomAttributeGroup<TwoLineListItem<Z>, Z>, TextGroup<TwoLineListItem<Z>, Z>, RelativeLayoutHierarchyInterface<TwoLineListItem<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TwoLineListItem(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTwoLineListItem(this);
   }

   public TwoLineListItem(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTwoLineListItem(this);
   }

   protected TwoLineListItem(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTwoLineListItem(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTwoLineListItem(this);
      return this.parent;
   }

   public final TwoLineListItem<Z> dynamic(Consumer<TwoLineListItem<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TwoLineListItem<Z> of(Consumer<TwoLineListItem<Z>> consumer) {
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
      return "twoLineListItem";
   }

   public final TwoLineListItem<Z> self() {
      return this;
   }

   public final TwoLineListItem<Z> attrMode(String attrMode) {
      this.visitor.visitAttributeMode(attrMode);
      return this;
   }
}
