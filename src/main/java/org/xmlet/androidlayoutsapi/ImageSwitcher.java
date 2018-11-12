package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ImageSwitcher<Z extends Element> implements CustomAttributeGroup<ImageSwitcher<Z>, Z>, TextGroup<ImageSwitcher<Z>, Z>, ViewSwitcherHierarchyInterface<ImageSwitcher<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ImageSwitcher(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementImageSwitcher(this);
   }

   public ImageSwitcher(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementImageSwitcher(this);
   }

   protected ImageSwitcher(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementImageSwitcher(this);
      }

   }

   public Z __() {
      this.visitor.visitParentImageSwitcher(this);
      return this.parent;
   }

   public final ImageSwitcher<Z> dynamic(Consumer<ImageSwitcher<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ImageSwitcher<Z> of(Consumer<ImageSwitcher<Z>> consumer) {
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
      return "imageSwitcher";
   }

   public final ImageSwitcher<Z> self() {
      return this;
   }
}
