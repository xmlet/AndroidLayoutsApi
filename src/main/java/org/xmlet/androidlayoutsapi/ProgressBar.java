package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ProgressBar<Z extends Element> implements CustomAttributeGroup<ProgressBar<Z>, Z>, TextGroup<ProgressBar<Z>, Z>, ViewHierarchyInterface<ProgressBar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ProgressBar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementProgressBar(this);
   }

   public ProgressBar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementProgressBar(this);
   }

   protected ProgressBar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementProgressBar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentProgressBar(this);
      return this.parent;
   }

   public final ProgressBar<Z> dynamic(Consumer<ProgressBar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ProgressBar<Z> of(Consumer<ProgressBar<Z>> consumer) {
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
      return "progressBar";
   }

   public final ProgressBar<Z> self() {
      return this;
   }

   public final ProgressBar<Z> attrAnimationResolution(String attrAnimationResolution) {
      this.visitor.visitAttributeAnimationResolution(attrAnimationResolution);
      return this;
   }

   public final ProgressBar<Z> attrIndeterminate(String attrIndeterminate) {
      this.visitor.visitAttributeIndeterminate(attrIndeterminate);
      return this;
   }

   public final ProgressBar<Z> attrIndeterminateBehavior(String attrIndeterminateBehavior) {
      this.visitor.visitAttributeIndeterminateBehavior(attrIndeterminateBehavior);
      return this;
   }

   public final ProgressBar<Z> attrIndeterminateDrawable(String attrIndeterminateDrawable) {
      this.visitor.visitAttributeIndeterminateDrawable(attrIndeterminateDrawable);
      return this;
   }

   public final ProgressBar<Z> attrIndeterminateDuration(String attrIndeterminateDuration) {
      this.visitor.visitAttributeIndeterminateDuration(attrIndeterminateDuration);
      return this;
   }

   public final ProgressBar<Z> attrIndeterminateOnly(String attrIndeterminateOnly) {
      this.visitor.visitAttributeIndeterminateOnly(attrIndeterminateOnly);
      return this;
   }

   public final ProgressBar<Z> attrInterpolator(String attrInterpolator) {
      this.visitor.visitAttributeInterpolator(attrInterpolator);
      return this;
   }

   public final ProgressBar<Z> attrMax(String attrMax) {
      this.visitor.visitAttributeMax(attrMax);
      return this;
   }

   public final ProgressBar<Z> attrMaxHeight(String attrMaxHeight) {
      this.visitor.visitAttributeMaxHeight(attrMaxHeight);
      return this;
   }

   public final ProgressBar<Z> attrMaxWidth(String attrMaxWidth) {
      this.visitor.visitAttributeMaxWidth(attrMaxWidth);
      return this;
   }

   public final ProgressBar<Z> attrMinHeight(String attrMinHeight) {
      this.visitor.visitAttributeMinHeight(attrMinHeight);
      return this;
   }

   public final ProgressBar<Z> attrMinWidth(String attrMinWidth) {
      this.visitor.visitAttributeMinWidth(attrMinWidth);
      return this;
   }

   public final ProgressBar<Z> attrProgress(String attrProgress) {
      this.visitor.visitAttributeProgress(attrProgress);
      return this;
   }

   public final ProgressBar<Z> attrProgressDrawable(String attrProgressDrawable) {
      this.visitor.visitAttributeProgressDrawable(attrProgressDrawable);
      return this;
   }

   public final ProgressBar<Z> attrSecondaryProgress(String attrSecondaryProgress) {
      this.visitor.visitAttributeSecondaryProgress(attrSecondaryProgress);
      return this;
   }
}
