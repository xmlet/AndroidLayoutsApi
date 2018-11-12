package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ImageButton<Z extends Element> implements CustomAttributeGroup<ImageButton<Z>, Z>, TextGroup<ImageButton<Z>, Z>, ImageViewHierarchyInterface<ImageButton<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ImageButton(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementImageButton(this);
   }

   public ImageButton(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementImageButton(this);
   }

   protected ImageButton(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementImageButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentImageButton(this);
      return this.parent;
   }

   public final ImageButton<Z> dynamic(Consumer<ImageButton<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ImageButton<Z> of(Consumer<ImageButton<Z>> consumer) {
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
      return "imageButton";
   }

   public final ImageButton<Z> self() {
      return this;
   }
}
