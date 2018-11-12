package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class GLSurfaceView<Z extends Element> implements CustomAttributeGroup<GLSurfaceView<Z>, Z>, TextGroup<GLSurfaceView<Z>, Z>, SurfaceViewHierarchyInterface<GLSurfaceView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public GLSurfaceView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGLSurfaceView(this);
   }

   public GLSurfaceView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGLSurfaceView(this);
   }

   protected GLSurfaceView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGLSurfaceView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGLSurfaceView(this);
      return this.parent;
   }

   public final GLSurfaceView<Z> dynamic(Consumer<GLSurfaceView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final GLSurfaceView<Z> of(Consumer<GLSurfaceView<Z>> consumer) {
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
      return "gLSurfaceView";
   }

   public final GLSurfaceView<Z> self() {
      return this;
   }
}
