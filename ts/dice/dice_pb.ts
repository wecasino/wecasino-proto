// @generated by protoc-gen-es v1.2.0 with parameter "target=ts,import_extension=none"
// @generated from file dice/dice.proto (package dice, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { proto3 } from "@bufbuild/protobuf";

/**
 * @generated from enum dice.DiceCard
 */
export enum DiceCard {
  /**
   * 未指定
   *
   * @generated from enum value: DICE_CARD_UNSPECIFIED = 0;
   */
  DICE_CARD_UNSPECIFIED = 0,

  /**
   * @generated from enum value: DICE_1 = 1;
   */
  DICE_1 = 1,

  /**
   * @generated from enum value: DICE_2 = 2;
   */
  DICE_2 = 2,

  /**
   * @generated from enum value: DICE_3 = 3;
   */
  DICE_3 = 3,

  /**
   * @generated from enum value: DICE_4 = 4;
   */
  DICE_4 = 4,

  /**
   * @generated from enum value: DICE_5 = 5;
   */
  DICE_5 = 5,

  /**
   * @generated from enum value: DICE_6 = 6;
   */
  DICE_6 = 6,
}
// Retrieve enum metadata with: proto3.getEnumType(DiceCard)
proto3.util.setEnumType(DiceCard, "dice.DiceCard", [
  { no: 0, name: "DICE_CARD_UNSPECIFIED" },
  { no: 1, name: "DICE_1" },
  { no: 2, name: "DICE_2" },
  { no: 3, name: "DICE_3" },
  { no: 4, name: "DICE_4" },
  { no: 5, name: "DICE_5" },
  { no: 6, name: "DICE_6" },
]);

