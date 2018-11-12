package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class VideoView<Z extends Element> implements CustomAttributeGroup<VideoView<Z>, Z>, TextGroup<VideoView<Z>, Z>, SurfaceViewHierarchyInterface<VideoView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public VideoView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementVideoView(this);
   }

   public VideoView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementVideoView(this);
   }

   protected VideoView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementVideoView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentVideoView(this);
      return this.parent;
   }

   public final VideoView<Z> dynamic(Consumer<VideoView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final VideoView<Z> of(Consumer<VideoView<Z>> consumer) {
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
      return "videoView";
   }

   public final VideoView<Z> self() {
      return this;
   }
}
