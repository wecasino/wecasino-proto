// @generated by protoc-gen-es v1.3.0 with parameter "target=ts,import_extension=none"
// @generated from file games/sicbo/recorder.proto (package games.sicbo, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { proto3 } from "@bufbuild/protobuf";

/**
 * @generated from enum games.sicbo.ResourceType
 */
export enum ResourceType {
  /**
   * 未指定
   *
   * @generated from enum value: RESOURCE_TYPE_UNSPECIFIED = 0;
   */
  RESOURCE_TYPE_UNSPECIFIED = 0,

  /**
   * 碗公
   *
   * @generated from enum value: BOWL = 1;
   */
  BOWL = 1,
}
// Retrieve enum metadata with: proto3.getEnumType(ResourceType)
proto3.util.setEnumType(ResourceType, "games.sicbo.ResourceType", [
  { no: 0, name: "RESOURCE_TYPE_UNSPECIFIED" },
  { no: 1, name: "BOWL" },
]);

/**
 * 步驟，依據遊戲供應商邏輯，不是每個步驟都會走到
 *
 * @generated from enum games.sicbo.Step
 */
export enum Step {
  /**
   * 未指定
   *
   * @generated from enum value: STEP_UNSPECIFIED = 0;
   */
  STEP_UNSPECIFIED = 0,

  /**
   * 本局開始
   *
   * @generated from enum value: ROUND_START = 1;
   */
  ROUND_START = 1,

  /**
   * 本局完成
   *
   * @generated from enum value: ROUND_FINISHED = 2;
   */
  ROUND_FINISHED = 2,

  /**
   * 本局取消
   *
   * @generated from enum value: ROUND_CANCELED = 3;
   */
  ROUND_CANCELED = 3,

  /**
   * 開放下注
   *
   * @generated from enum value: OPEN_FOR_BETTING = 4;
   */
  OPEN_FOR_BETTING = 4,

  /**
   * 停止下注
   *
   * @generated from enum value: CLOSE_THE_BETTING = 5;
   */
  CLOSE_THE_BETTING = 5,

  /**
   * 擲骰
   *
   * @generated from enum value: THROW_DICE = 8;
   */
  THROW_DICE = 8,

  /**
   * PITBOSS 修改骰點
   *
   * @generated from enum value: PITBOSS_MODIFY_BOWL = 16;
   */
  PITBOSS_MODIFY_BOWL = 16,
}
// Retrieve enum metadata with: proto3.getEnumType(Step)
proto3.util.setEnumType(Step, "games.sicbo.Step", [
  { no: 0, name: "STEP_UNSPECIFIED" },
  { no: 1, name: "ROUND_START" },
  { no: 2, name: "ROUND_FINISHED" },
  { no: 3, name: "ROUND_CANCELED" },
  { no: 4, name: "OPEN_FOR_BETTING" },
  { no: 5, name: "CLOSE_THE_BETTING" },
  { no: 8, name: "THROW_DICE" },
  { no: 16, name: "PITBOSS_MODIFY_BOWL" },
]);

/**
 * 座位功能代碼
 *
 * @generated from enum games.sicbo.Seat
 */
export enum Seat {
  /**
   * 未指定
   *
   * @generated from enum value: SEAT_UNSPECIFIED = 0;
   */
  SEAT_UNSPECIFIED = 0,

  /**
   * Dealer 
   *
   * @generated from enum value: DEALER = 1;
   */
  DEALER = 1,

  /**
   * Pitboss
   *
   * @generated from enum value: PITBOSS = 9;
   */
  PITBOSS = 9,
}
// Retrieve enum metadata with: proto3.getEnumType(Seat)
proto3.util.setEnumType(Seat, "games.sicbo.Seat", [
  { no: 0, name: "SEAT_UNSPECIFIED" },
  { no: 1, name: "DEALER" },
  { no: 9, name: "PITBOSS" },
]);

/**
 * 結果紀錄類型代碼
 *
 * @generated from enum games.sicbo.ResultRecordType
 */
export enum ResultRecordType {
  /**
   * 未指定
   *
   * @generated from enum value: RESULT_RECORD_TYPE_UNSPECIFIED = 0;
   */
  RESULT_RECORD_TYPE_UNSPECIFIED = 0,

  /**
   * 遊戲局結束
   *
   * @generated from enum value: ROUND_FINISH = 1;
   */
  ROUND_FINISH = 1,

  /**
   * Pitboss 修正
   *
   * @generated from enum value: PITBOSS_MODIFY_RESULT = 2;
   */
  PITBOSS_MODIFY_RESULT = 2,
}
// Retrieve enum metadata with: proto3.getEnumType(ResultRecordType)
proto3.util.setEnumType(ResultRecordType, "games.sicbo.ResultRecordType", [
  { no: 0, name: "RESULT_RECORD_TYPE_UNSPECIFIED" },
  { no: 1, name: "ROUND_FINISH" },
  { no: 2, name: "PITBOSS_MODIFY_RESULT" },
]);

