package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class View<Z extends Element> implements CustomAttributeGroup<View<Z>, Z>, TextGroup<View<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public View(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementView(this);
   }

   public View(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementView(this);
   }

   protected View(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentView(this);
      return this.parent;
   }

   public final View<Z> dynamic(Consumer<View<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final View<Z> of(Consumer<View<Z>> consumer) {
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
      return "view";
   }

   public final View<Z> self() {
      return this;
   }

   public final View<Z> attrLayoutX(String attrLayoutX) {
      this.visitor.visitAttributeLayoutX(attrLayoutX);
      return this;
   }

   public final View<Z> attrLayoutY(String attrLayoutY) {
      this.visitor.visitAttributeLayoutY(attrLayoutY);
      return this;
   }

   public final View<Z> attrLayoutGravity(EnumLayoutGravityView attrLayoutGravity) {
      this.visitor.visitAttributeLayoutGravity(attrLayoutGravity.getValue());
      return this;
   }

   public final View<Z> attrLayoutColumn(String attrLayoutColumn) {
      this.visitor.visitAttributeLayoutColumn(attrLayoutColumn);
      return this;
   }

   public final View<Z> attrLayoutColumnSpan(String attrLayoutColumnSpan) {
      this.visitor.visitAttributeLayoutColumnSpan(attrLayoutColumnSpan);
      return this;
   }

   public final View<Z> attrLayoutRow(String attrLayoutRow) {
      this.visitor.visitAttributeLayoutRow(attrLayoutRow);
      return this;
   }

   public final View<Z> attrLayoutRowSpan(String attrLayoutRowSpan) {
      this.visitor.visitAttributeLayoutRowSpan(attrLayoutRowSpan);
      return this;
   }

   public final View<Z> attrIcon(String attrIcon) {
      this.visitor.visitAttributeIcon(attrIcon);
      return this;
   }

   public final View<Z> attrImeSubtypeExtraValue(String attrImeSubtypeExtraValue) {
      this.visitor.visitAttributeImeSubtypeExtraValue(attrImeSubtypeExtraValue);
      return this;
   }

   public final View<Z> attrImeSubtypeLocale(String attrImeSubtypeLocale) {
      this.visitor.visitAttributeImeSubtypeLocale(attrImeSubtypeLocale);
      return this;
   }

   public final View<Z> attrImeSubtypeMode(String attrImeSubtypeMode) {
      this.visitor.visitAttributeImeSubtypeMode(attrImeSubtypeMode);
      return this;
   }

   public final View<Z> attrIsAuxiliary(String attrIsAuxiliary) {
      this.visitor.visitAttributeIsAuxiliary(attrIsAuxiliary);
      return this;
   }

   public final View<Z> attrLabel(String attrLabel) {
      this.visitor.visitAttributeLabel(attrLabel);
      return this;
   }

   public final View<Z> attrOverridesImplicitlyEnabledSubtype(String attrOverridesImplicitlyEnabledSubtype) {
      this.visitor.visitAttributeOverridesImplicitlyEnabledSubtype(attrOverridesImplicitlyEnabledSubtype);
      return this;
   }

   public final View<Z> attrCodes(String attrCodes) {
      this.visitor.visitAttributeCodes(attrCodes);
      return this;
   }

   public final View<Z> attrIconPreview(String attrIconPreview) {
      this.visitor.visitAttributeIconPreview(attrIconPreview);
      return this;
   }

   public final View<Z> attrIsModifier(String attrIsModifier) {
      this.visitor.visitAttributeIsModifier(attrIsModifier);
      return this;
   }

   public final View<Z> attrIsRepeatable(String attrIsRepeatable) {
      this.visitor.visitAttributeIsRepeatable(attrIsRepeatable);
      return this;
   }

   public final View<Z> attrIsSticky(String attrIsSticky) {
      this.visitor.visitAttributeIsSticky(attrIsSticky);
      return this;
   }

   public final View<Z> attrKeyEdgeFlags(String attrKeyEdgeFlags) {
      this.visitor.visitAttributeKeyEdgeFlags(attrKeyEdgeFlags);
      return this;
   }

   public final View<Z> attrKeyIcon(String attrKeyIcon) {
      this.visitor.visitAttributeKeyIcon(attrKeyIcon);
      return this;
   }

   public final View<Z> attrKeyLabel(String attrKeyLabel) {
      this.visitor.visitAttributeKeyLabel(attrKeyLabel);
      return this;
   }

   public final View<Z> attrKeyOutputText(String attrKeyOutputText) {
      this.visitor.visitAttributeKeyOutputText(attrKeyOutputText);
      return this;
   }

   public final View<Z> attrKeyboardMode(String attrKeyboardMode) {
      this.visitor.visitAttributeKeyboardMode(attrKeyboardMode);
      return this;
   }

   public final View<Z> attrPopupCharacters(String attrPopupCharacters) {
      this.visitor.visitAttributePopupCharacters(attrPopupCharacters);
      return this;
   }

   public final View<Z> attrPopupKeyboard(String attrPopupKeyboard) {
      this.visitor.visitAttributePopupKeyboard(attrPopupKeyboard);
      return this;
   }

   public final View<Z> attrRowEdgeFlags(String attrRowEdgeFlags) {
      this.visitor.visitAttributeRowEdgeFlags(attrRowEdgeFlags);
      return this;
   }

   public final View<Z> attrLayoutHeight(String attrLayoutHeight) {
      this.visitor.visitAttributeLayoutHeight(attrLayoutHeight);
      return this;
   }

   public final View<Z> attrLayoutWeight(String attrLayoutWeight) {
      this.visitor.visitAttributeLayoutWeight(attrLayoutWeight);
      return this;
   }

   public final View<Z> attrLayoutWidth(String attrLayoutWidth) {
      this.visitor.visitAttributeLayoutWidth(attrLayoutWidth);
      return this;
   }

   public final View<Z> attrLayoutAbove(String attrLayoutAbove) {
      this.visitor.visitAttributeLayoutAbove(attrLayoutAbove);
      return this;
   }

   public final View<Z> attrLayoutAlignBaseline(String attrLayoutAlignBaseline) {
      this.visitor.visitAttributeLayoutAlignBaseline(attrLayoutAlignBaseline);
      return this;
   }

   public final View<Z> attrLayoutAlignBottom(String attrLayoutAlignBottom) {
      this.visitor.visitAttributeLayoutAlignBottom(attrLayoutAlignBottom);
      return this;
   }

   public final View<Z> attrLayoutAlignLeft(String attrLayoutAlignLeft) {
      this.visitor.visitAttributeLayoutAlignLeft(attrLayoutAlignLeft);
      return this;
   }

   public final View<Z> attrLayoutAlignParentBottom(String attrLayoutAlignParentBottom) {
      this.visitor.visitAttributeLayoutAlignParentBottom(attrLayoutAlignParentBottom);
      return this;
   }

   public final View<Z> attrLayoutAlignParentLeft(String attrLayoutAlignParentLeft) {
      this.visitor.visitAttributeLayoutAlignParentLeft(attrLayoutAlignParentLeft);
      return this;
   }

   public final View<Z> attrLayoutAlignParentRight(String attrLayoutAlignParentRight) {
      this.visitor.visitAttributeLayoutAlignParentRight(attrLayoutAlignParentRight);
      return this;
   }

   public final View<Z> attrLayoutAlignParentTop(String attrLayoutAlignParentTop) {
      this.visitor.visitAttributeLayoutAlignParentTop(attrLayoutAlignParentTop);
      return this;
   }

   public final View<Z> attrLayoutAlignRight(String attrLayoutAlignRight) {
      this.visitor.visitAttributeLayoutAlignRight(attrLayoutAlignRight);
      return this;
   }

   public final View<Z> attrLayoutAlignTop(String attrLayoutAlignTop) {
      this.visitor.visitAttributeLayoutAlignTop(attrLayoutAlignTop);
      return this;
   }

   public final View<Z> attrLayoutAlignWithParentIfMissing(String attrLayoutAlignWithParentIfMissing) {
      this.visitor.visitAttributeLayoutAlignWithParentIfMissing(attrLayoutAlignWithParentIfMissing);
      return this;
   }

   public final View<Z> attrLayoutBelow(String attrLayoutBelow) {
      this.visitor.visitAttributeLayoutBelow(attrLayoutBelow);
      return this;
   }

   public final View<Z> attrLayoutCenterHorizontal(String attrLayoutCenterHorizontal) {
      this.visitor.visitAttributeLayoutCenterHorizontal(attrLayoutCenterHorizontal);
      return this;
   }

   public final View<Z> attrLayoutCenterInParent(String attrLayoutCenterInParent) {
      this.visitor.visitAttributeLayoutCenterInParent(attrLayoutCenterInParent);
      return this;
   }

   public final View<Z> attrLayoutCenterVertical(String attrLayoutCenterVertical) {
      this.visitor.visitAttributeLayoutCenterVertical(attrLayoutCenterVertical);
      return this;
   }

   public final View<Z> attrLayoutToLeftOf(String attrLayoutToLeftOf) {
      this.visitor.visitAttributeLayoutToLeftOf(attrLayoutToLeftOf);
      return this;
   }

   public final View<Z> attrLayoutToRightOf(String attrLayoutToRightOf) {
      this.visitor.visitAttributeLayoutToRightOf(attrLayoutToRightOf);
      return this;
   }

   public final View<Z> attrSubtypeExtraValue(String attrSubtypeExtraValue) {
      this.visitor.visitAttributeSubtypeExtraValue(attrSubtypeExtraValue);
      return this;
   }

   public final View<Z> attrSubtypeLocale(String attrSubtypeLocale) {
      this.visitor.visitAttributeSubtypeLocale(attrSubtypeLocale);
      return this;
   }

   public final View<Z> attrLayoutSpan(String attrLayoutSpan) {
      this.visitor.visitAttributeLayoutSpan(attrLayoutSpan);
      return this;
   }

   public final View<Z> attrLayoutScale(String attrLayoutScale) {
      this.visitor.visitAttributeLayoutScale(attrLayoutScale);
      return this;
   }

   public final View<Z> attrAlpha(String attrAlpha) {
      this.visitor.visitAttributeAlpha(attrAlpha);
      return this;
   }

   public final View<Z> attrBackground(String attrBackground) {
      this.visitor.visitAttributeBackground(attrBackground);
      return this;
   }

   public final View<Z> attrClickable(Boolean attrClickable) {
      this.visitor.visitAttributeClickable(attrClickable.toString());
      return this;
   }

   public final View<Z> attrContentDescription(String attrContentDescription) {
      this.visitor.visitAttributeContentDescription(attrContentDescription);
      return this;
   }

   public final View<Z> attrDrawingCacheQuality(EnumDrawingCacheQualityView attrDrawingCacheQuality) {
      this.visitor.visitAttributeDrawingCacheQuality(attrDrawingCacheQuality.getValue());
      return this;
   }

   public final View<Z> attrDuplicateParentState(Boolean attrDuplicateParentState) {
      this.visitor.visitAttributeDuplicateParentState(attrDuplicateParentState.toString());
      return this;
   }

   public final View<Z> attrFadeScrollbars(Boolean attrFadeScrollbars) {
      this.visitor.visitAttributeFadeScrollbars(attrFadeScrollbars.toString());
      return this;
   }

   public final View<Z> attrFadingEdge(EnumFadingEdgeView attrFadingEdge) {
      this.visitor.visitAttributeFadingEdge(attrFadingEdge.getValue());
      return this;
   }

   public final View<Z> attrFadingEdgeLength(String attrFadingEdgeLength) {
      this.visitor.visitAttributeFadingEdgeLength(attrFadingEdgeLength);
      return this;
   }

   public final View<Z> attrFilterTouchesWhenObscured(String attrFilterTouchesWhenObscured) {
      this.visitor.visitAttributeFilterTouchesWhenObscured(attrFilterTouchesWhenObscured);
      return this;
   }

   public final View<Z> attrFitsSystemWindows(Boolean attrFitsSystemWindows) {
      this.visitor.visitAttributeFitsSystemWindows(attrFitsSystemWindows.toString());
      return this;
   }

   public final View<Z> attrFocusable(Boolean attrFocusable) {
      this.visitor.visitAttributeFocusable(attrFocusable.toString());
      return this;
   }

   public final View<Z> attrFocusableInTouchMode(Boolean attrFocusableInTouchMode) {
      this.visitor.visitAttributeFocusableInTouchMode(attrFocusableInTouchMode.toString());
      return this;
   }

   public final View<Z> attrHapticFeedbackEnabled(Boolean attrHapticFeedbackEnabled) {
      this.visitor.visitAttributeHapticFeedbackEnabled(attrHapticFeedbackEnabled.toString());
      return this;
   }

   public final View<Z> attrId(String attrId) {
      this.visitor.visitAttributeId(attrId);
      return this;
   }

   public final View<Z> attrIsScrollContainer(Boolean attrIsScrollContainer) {
      this.visitor.visitAttributeIsScrollContainer(attrIsScrollContainer.toString());
      return this;
   }

   public final View<Z> attrKeepScreenOn(Boolean attrKeepScreenOn) {
      this.visitor.visitAttributeKeepScreenOn(attrKeepScreenOn.toString());
      return this;
   }

   public final View<Z> attrLayerType(String attrLayerType) {
      this.visitor.visitAttributeLayerType(attrLayerType);
      return this;
   }

   public final View<Z> attrLongClickable(Boolean attrLongClickable) {
      this.visitor.visitAttributeLongClickable(attrLongClickable.toString());
      return this;
   }

   public final View<Z> attrNextFocusDown(String attrNextFocusDown) {
      this.visitor.visitAttributeNextFocusDown(attrNextFocusDown);
      return this;
   }

   public final View<Z> attrNextFocusForward(String attrNextFocusForward) {
      this.visitor.visitAttributeNextFocusForward(attrNextFocusForward);
      return this;
   }

   public final View<Z> attrNextFocusLeft(String attrNextFocusLeft) {
      this.visitor.visitAttributeNextFocusLeft(attrNextFocusLeft);
      return this;
   }

   public final View<Z> attrNextFocusRight(String attrNextFocusRight) {
      this.visitor.visitAttributeNextFocusRight(attrNextFocusRight);
      return this;
   }

   public final View<Z> attrNextFocusUp(String attrNextFocusUp) {
      this.visitor.visitAttributeNextFocusUp(attrNextFocusUp);
      return this;
   }

   public final View<Z> attrOnClick(String attrOnClick) {
      this.visitor.visitAttributeOnClick(attrOnClick);
      return this;
   }

   public final View<Z> attrOverScrollMode(String attrOverScrollMode) {
      this.visitor.visitAttributeOverScrollMode(attrOverScrollMode);
      return this;
   }

   public final View<Z> attrPadding(String attrPadding) {
      this.visitor.visitAttributePadding(attrPadding);
      return this;
   }

   public final View<Z> attrPaddingBottom(String attrPaddingBottom) {
      this.visitor.visitAttributePaddingBottom(attrPaddingBottom);
      return this;
   }

   public final View<Z> attrPaddingLeft(String attrPaddingLeft) {
      this.visitor.visitAttributePaddingLeft(attrPaddingLeft);
      return this;
   }

   public final View<Z> attrPaddingRight(String attrPaddingRight) {
      this.visitor.visitAttributePaddingRight(attrPaddingRight);
      return this;
   }

   public final View<Z> attrPaddingTop(String attrPaddingTop) {
      this.visitor.visitAttributePaddingTop(attrPaddingTop);
      return this;
   }

   public final View<Z> attrRequiresFadingEdge(String attrRequiresFadingEdge) {
      this.visitor.visitAttributeRequiresFadingEdge(attrRequiresFadingEdge);
      return this;
   }

   public final View<Z> attrRotation(String attrRotation) {
      this.visitor.visitAttributeRotation(attrRotation);
      return this;
   }

   public final View<Z> attrRotationX(String attrRotationX) {
      this.visitor.visitAttributeRotationX(attrRotationX);
      return this;
   }

   public final View<Z> attrRotationY(String attrRotationY) {
      this.visitor.visitAttributeRotationY(attrRotationY);
      return this;
   }

   public final View<Z> attrSaveEnabled(Boolean attrSaveEnabled) {
      this.visitor.visitAttributeSaveEnabled(attrSaveEnabled.toString());
      return this;
   }

   public final View<Z> attrScaleX(String attrScaleX) {
      this.visitor.visitAttributeScaleX(attrScaleX);
      return this;
   }

   public final View<Z> attrScaleY(String attrScaleY) {
      this.visitor.visitAttributeScaleY(attrScaleY);
      return this;
   }

   public final View<Z> attrScrollX(String attrScrollX) {
      this.visitor.visitAttributeScrollX(attrScrollX);
      return this;
   }

   public final View<Z> attrScrollY(String attrScrollY) {
      this.visitor.visitAttributeScrollY(attrScrollY);
      return this;
   }

   public final View<Z> attrScrollbarAlwaysDrawHorizontalTrack(Boolean attrScrollbarAlwaysDrawHorizontalTrack) {
      this.visitor.visitAttributeScrollbarAlwaysDrawHorizontalTrack(attrScrollbarAlwaysDrawHorizontalTrack.toString());
      return this;
   }

   public final View<Z> attrScrollbarAlwaysDrawVerticalTrack(Boolean attrScrollbarAlwaysDrawVerticalTrack) {
      this.visitor.visitAttributeScrollbarAlwaysDrawVerticalTrack(attrScrollbarAlwaysDrawVerticalTrack.toString());
      return this;
   }

   public final View<Z> attrScrollbarDefaultDelayBeforeFade(String attrScrollbarDefaultDelayBeforeFade) {
      this.visitor.visitAttributeScrollbarDefaultDelayBeforeFade(attrScrollbarDefaultDelayBeforeFade);
      return this;
   }

   public final View<Z> attrScrollbarFadeDuration(String attrScrollbarFadeDuration) {
      this.visitor.visitAttributeScrollbarFadeDuration(attrScrollbarFadeDuration);
      return this;
   }

   public final View<Z> attrScrollbarSize(String attrScrollbarSize) {
      this.visitor.visitAttributeScrollbarSize(attrScrollbarSize);
      return this;
   }

   public final View<Z> attrScrollbarStyle(EnumScrollbarStyleView attrScrollbarStyle) {
      this.visitor.visitAttributeScrollbarStyle(attrScrollbarStyle.getValue());
      return this;
   }

   public final View<Z> attrScrollbarThumbHorizontal(String attrScrollbarThumbHorizontal) {
      this.visitor.visitAttributeScrollbarThumbHorizontal(attrScrollbarThumbHorizontal);
      return this;
   }

   public final View<Z> attrScrollbarThumbVertical(String attrScrollbarThumbVertical) {
      this.visitor.visitAttributeScrollbarThumbVertical(attrScrollbarThumbVertical);
      return this;
   }

   public final View<Z> attrScrollbarTrackHorizontal(String attrScrollbarTrackHorizontal) {
      this.visitor.visitAttributeScrollbarTrackHorizontal(attrScrollbarTrackHorizontal);
      return this;
   }

   public final View<Z> attrScrollbarTrackVertical(String attrScrollbarTrackVertical) {
      this.visitor.visitAttributeScrollbarTrackVertical(attrScrollbarTrackVertical);
      return this;
   }

   public final View<Z> attrScrollbars(EnumScrollbarsView attrScrollbars) {
      this.visitor.visitAttributeScrollbars(attrScrollbars.getValue());
      return this;
   }

   public final View<Z> attrSoundEffectsEnabled(Boolean attrSoundEffectsEnabled) {
      this.visitor.visitAttributeSoundEffectsEnabled(attrSoundEffectsEnabled.toString());
      return this;
   }

   public final View<Z> attrTag(String attrTag) {
      this.visitor.visitAttributeTag(attrTag);
      return this;
   }

   public final View<Z> attrTransformPivotX(String attrTransformPivotX) {
      this.visitor.visitAttributeTransformPivotX(attrTransformPivotX);
      return this;
   }

   public final View<Z> attrTransformPivotY(String attrTransformPivotY) {
      this.visitor.visitAttributeTransformPivotY(attrTransformPivotY);
      return this;
   }

   public final View<Z> attrTranslationX(String attrTranslationX) {
      this.visitor.visitAttributeTranslationX(attrTranslationX);
      return this;
   }

   public final View<Z> attrTranslationY(String attrTranslationY) {
      this.visitor.visitAttributeTranslationY(attrTranslationY);
      return this;
   }

   public final View<Z> attrVerticalScrollbarPosition(String attrVerticalScrollbarPosition) {
      this.visitor.visitAttributeVerticalScrollbarPosition(attrVerticalScrollbarPosition);
      return this;
   }

   public final View<Z> attrVisibility(EnumVisibilityView attrVisibility) {
      this.visitor.visitAttributeVisibility(attrVisibility.getValue());
      return this;
   }

   public final View<Z> attrLayoutMargin(String attrLayoutMargin) {
      this.visitor.visitAttributeLayoutMargin(attrLayoutMargin);
      return this;
   }

   public final View<Z> attrLayoutMarginBottom(String attrLayoutMarginBottom) {
      this.visitor.visitAttributeLayoutMarginBottom(attrLayoutMarginBottom);
      return this;
   }

   public final View<Z> attrLayoutMarginLeft(String attrLayoutMarginLeft) {
      this.visitor.visitAttributeLayoutMarginLeft(attrLayoutMarginLeft);
      return this;
   }

   public final View<Z> attrLayoutMarginRight(String attrLayoutMarginRight) {
      this.visitor.visitAttributeLayoutMarginRight(attrLayoutMarginRight);
      return this;
   }

   public final View<Z> attrLayoutMarginTop(String attrLayoutMarginTop) {
      this.visitor.visitAttributeLayoutMarginTop(attrLayoutMarginTop);
      return this;
   }
}
