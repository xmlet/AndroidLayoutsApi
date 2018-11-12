package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ZoomButton<Z extends Element> implements CustomAttributeGroup<ZoomButton<Z>, Z>, TextGroup<ZoomButton<Z>, Z>, ImageButtonHierarchyInterface<ZoomButton<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ZoomButton(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementZoomButton(this);
   }

   public ZoomButton(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementZoomButton(this);
   }

   protected ZoomButton(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementZoomButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentZoomButton(this);
      return this.parent;
   }

   public final ZoomButton<Z> dynamic(Consumer<ZoomButton<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ZoomButton<Z> of(Consumer<ZoomButton<Z>> consumer) {
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
      return "zoomButton";
   }

   public final ZoomButton<Z> self() {
      return this;
   }
}
