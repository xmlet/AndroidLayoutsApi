package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RSSurfaceView<Z extends Element> implements CustomAttributeGroup<RSSurfaceView<Z>, Z>, TextGroup<RSSurfaceView<Z>, Z>, SurfaceViewHierarchyInterface<RSSurfaceView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RSSurfaceView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRSSurfaceView(this);
   }

   public RSSurfaceView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRSSurfaceView(this);
   }

   protected RSSurfaceView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRSSurfaceView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRSSurfaceView(this);
      return this.parent;
   }

   public final RSSurfaceView<Z> dynamic(Consumer<RSSurfaceView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RSSurfaceView<Z> of(Consumer<RSSurfaceView<Z>> consumer) {
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
      return "rSSurfaceView";
   }

   public final RSSurfaceView<Z> self() {
      return this;
   }
}
