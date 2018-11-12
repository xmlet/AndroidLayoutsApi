package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class MediaController<Z extends Element> implements CustomAttributeGroup<MediaController<Z>, Z>, TextGroup<MediaController<Z>, Z>, FrameLayoutHierarchyInterface<MediaController<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MediaController(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMediaController(this);
   }

   public MediaController(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMediaController(this);
   }

   protected MediaController(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMediaController(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMediaController(this);
      return this.parent;
   }

   public final MediaController<Z> dynamic(Consumer<MediaController<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MediaController<Z> of(Consumer<MediaController<Z>> consumer) {
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
      return "mediaController";
   }

   public final MediaController<Z> self() {
      return this;
   }
}
