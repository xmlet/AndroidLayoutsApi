package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class SurfaceView<Z extends Element> implements CustomAttributeGroup<SurfaceView<Z>, Z>, TextGroup<SurfaceView<Z>, Z>, ViewHierarchyInterface<SurfaceView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SurfaceView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSurfaceView(this);
   }

   public SurfaceView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSurfaceView(this);
   }

   protected SurfaceView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSurfaceView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSurfaceView(this);
      return this.parent;
   }

   public final SurfaceView<Z> dynamic(Consumer<SurfaceView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SurfaceView<Z> of(Consumer<SurfaceView<Z>> consumer) {
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
      return "surfaceView";
   }

   public final SurfaceView<Z> self() {
      return this;
   }
}
