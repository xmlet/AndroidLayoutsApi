package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ScrollView<Z extends Element> implements CustomAttributeGroup<ScrollView<Z>, Z>, TextGroup<ScrollView<Z>, Z>, FrameLayoutHierarchyInterface<ScrollView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ScrollView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementScrollView(this);
   }

   public ScrollView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementScrollView(this);
   }

   protected ScrollView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementScrollView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentScrollView(this);
      return this.parent;
   }

   public final ScrollView<Z> dynamic(Consumer<ScrollView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ScrollView<Z> of(Consumer<ScrollView<Z>> consumer) {
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
      return "scrollView";
   }

   public final ScrollView<Z> self() {
      return this;
   }

   public final ScrollView<Z> attrFillViewport(String attrFillViewport) {
      this.visitor.visitAttributeFillViewport(attrFillViewport);
      return this;
   }
}
