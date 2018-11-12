package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TextureView<Z extends Element> implements CustomAttributeGroup<TextureView<Z>, Z>, TextGroup<TextureView<Z>, Z>, ViewHierarchyInterface<TextureView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TextureView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTextureView(this);
   }

   public TextureView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTextureView(this);
   }

   protected TextureView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTextureView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTextureView(this);
      return this.parent;
   }

   public final TextureView<Z> dynamic(Consumer<TextureView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TextureView<Z> of(Consumer<TextureView<Z>> consumer) {
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
      return "textureView";
   }

   public final TextureView<Z> self() {
      return this;
   }
}
