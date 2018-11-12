package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ZoomControls<Z extends Element> implements CustomAttributeGroup<ZoomControls<Z>, Z>, TextGroup<ZoomControls<Z>, Z>, LinearLayoutHierarchyInterface<ZoomControls<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ZoomControls(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementZoomControls(this);
   }

   public ZoomControls(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementZoomControls(this);
   }

   protected ZoomControls(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementZoomControls(this);
      }

   }

   public Z __() {
      this.visitor.visitParentZoomControls(this);
      return this.parent;
   }

   public final ZoomControls<Z> dynamic(Consumer<ZoomControls<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ZoomControls<Z> of(Consumer<ZoomControls<Z>> consumer) {
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
      return "zoomControls";
   }

   public final ZoomControls<Z> self() {
      return this;
   }
}
