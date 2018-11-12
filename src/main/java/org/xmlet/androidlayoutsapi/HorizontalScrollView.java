package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class HorizontalScrollView<Z extends Element> implements CustomAttributeGroup<HorizontalScrollView<Z>, Z>, TextGroup<HorizontalScrollView<Z>, Z>, FrameLayoutHierarchyInterface<HorizontalScrollView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public HorizontalScrollView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHorizontalScrollView(this);
   }

   public HorizontalScrollView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHorizontalScrollView(this);
   }

   protected HorizontalScrollView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHorizontalScrollView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHorizontalScrollView(this);
      return this.parent;
   }

   public final HorizontalScrollView<Z> dynamic(Consumer<HorizontalScrollView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final HorizontalScrollView<Z> of(Consumer<HorizontalScrollView<Z>> consumer) {
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
      return "horizontalScrollView";
   }

   public final HorizontalScrollView<Z> self() {
      return this;
   }

   public final HorizontalScrollView<Z> attrFillViewport(String attrFillViewport) {
      this.visitor.visitAttributeFillViewport(attrFillViewport);
      return this;
   }
}
