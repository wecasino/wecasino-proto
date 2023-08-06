// @generated by protoc-gen-es v1.3.0 with parameter "target=ts,import_extension=none"
// @generated from file games/bullfight/record.proto (package games.bullfight, syntax proto3)
/* eslint-disable */
// @ts-nocheck
import { proto3 } from "@bufbuild/protobuf";
/**
 * @generated from enum games.bullfight.ResourceType
 */
export var ResourceType;
(function (ResourceType) {
    /**
     * 未指定
     *
     * @generated from enum value: RESOURCE_TYPE_UNSPECIFIED = 0;
     */
    ResourceType[ResourceType["RESOURCE_TYPE_UNSPECIFIED"] = 0] = "RESOURCE_TYPE_UNSPECIFIED";
    /**
     * 例牌
     *
     * @generated from enum value: NORMAL = 1;
     */
    ResourceType[ResourceType["NORMAL"] = 1] = "NORMAL";
})(ResourceType || (ResourceType = {}));
// Retrieve enum metadata with: proto3.getEnumType(ResourceType)
proto3.util.setEnumType(ResourceType, "games.bullfight.ResourceType", [
    { no: 0, name: "RESOURCE_TYPE_UNSPECIFIED" },
    { no: 1, name: "NORMAL" },
]);
/**
 * 步驟，依據遊戲供應商邏輯，不是每個步驟都會走到
 *
 * @generated from enum games.bullfight.Step
 */
export var Step;
(function (Step) {
    /**
     * 未指定
     *
     * @generated from enum value: STEP_UNSPECIFIED = 0;
     */
    Step[Step["STEP_UNSPECIFIED"] = 0] = "STEP_UNSPECIFIED";
    /**
     * 本局開始
     *
     * @generated from enum value: ROUND_START = 1;
     */
    Step[Step["ROUND_START"] = 1] = "ROUND_START";
    /**
     * 本局完成
     *
     * @generated from enum value: ROUND_FINISHED = 2;
     */
    Step[Step["ROUND_FINISHED"] = 2] = "ROUND_FINISHED";
    /**
     * 本局取消
     *
     * @generated from enum value: ROUND_CANCELED = 3;
     */
    Step[Step["ROUND_CANCELED"] = 3] = "ROUND_CANCELED";
    /**
     * 派發起始位子牌(決定順位)
     *
     * @generated from enum value: DEAL_FIRSTCARD = 4;
     */
    Step[Step["DEAL_FIRSTCARD"] = 4] = "DEAL_FIRSTCARD";
    /**
     * 派發莊家例牌
     *
     * @generated from enum value: DEAL_BANKER_1 = 5;
     */
    Step[Step["DEAL_BANKER_1"] = 5] = "DEAL_BANKER_1";
    /**
     * 派發玩家1例牌
     *
     * @generated from enum value: DEAL_PLAYER_1 = 6;
     */
    Step[Step["DEAL_PLAYER_1"] = 6] = "DEAL_PLAYER_1";
    /**
     * 派發玩家2例牌
     *
     * @generated from enum value: DEAL_PLAYER_2 = 7;
     */
    Step[Step["DEAL_PLAYER_2"] = 7] = "DEAL_PLAYER_2";
    /**
     * 派發玩家3例牌
     *
     * @generated from enum value: DEAL_PLAYER_3 = 8;
     */
    Step[Step["DEAL_PLAYER_3"] = 8] = "DEAL_PLAYER_3";
    /**
     * 開放下注
     *
     * @generated from enum value: OPEN_FOR_BETTING = 9;
     */
    Step[Step["OPEN_FOR_BETTING"] = 9] = "OPEN_FOR_BETTING";
    /**
     * 停止下注
     *
     * @generated from enum value: CLOSE_THE_BETTING = 10;
     */
    Step[Step["CLOSE_THE_BETTING"] = 10] = "CLOSE_THE_BETTING";
    /**
     * 開莊家1例牌
     *
     * @generated from enum value: SHOW_BANKER_1 = 12;
     */
    Step[Step["SHOW_BANKER_1"] = 12] = "SHOW_BANKER_1";
    /**
     * 開玩家1例牌
     *
     * @generated from enum value: SHOW_PLAYER_1 = 13;
     */
    Step[Step["SHOW_PLAYER_1"] = 13] = "SHOW_PLAYER_1";
    /**
     * 開玩家2例牌
     *
     * @generated from enum value: SHOW_PLAYER_2 = 14;
     */
    Step[Step["SHOW_PLAYER_2"] = 14] = "SHOW_PLAYER_2";
    /**
     * 開玩家3例牌
     *
     * @generated from enum value: SHOW_PLAYER_3 = 15;
     */
    Step[Step["SHOW_PLAYER_3"] = 15] = "SHOW_PLAYER_3";
    /**
     * PITBOSS 修改派發例牌
     *
     * @generated from enum value: PITBOSS_MODIFY_BANKER_1 = 24;
     */
    Step[Step["PITBOSS_MODIFY_BANKER_1"] = 24] = "PITBOSS_MODIFY_BANKER_1";
    /**
     * @generated from enum value: PITBOSS_MODIFY_PLAYER_1 = 25;
     */
    Step[Step["PITBOSS_MODIFY_PLAYER_1"] = 25] = "PITBOSS_MODIFY_PLAYER_1";
    /**
     * @generated from enum value: PITBOSS_MODIFY_PLAYER_2 = 26;
     */
    Step[Step["PITBOSS_MODIFY_PLAYER_2"] = 26] = "PITBOSS_MODIFY_PLAYER_2";
    /**
     * @generated from enum value: PITBOSS_MODIFY_PLAYER_3 = 27;
     */
    Step[Step["PITBOSS_MODIFY_PLAYER_3"] = 27] = "PITBOSS_MODIFY_PLAYER_3";
})(Step || (Step = {}));
// Retrieve enum metadata with: proto3.getEnumType(Step)
proto3.util.setEnumType(Step, "games.bullfight.Step", [
    { no: 0, name: "STEP_UNSPECIFIED" },
    { no: 1, name: "ROUND_START" },
    { no: 2, name: "ROUND_FINISHED" },
    { no: 3, name: "ROUND_CANCELED" },
    { no: 4, name: "DEAL_FIRSTCARD" },
    { no: 5, name: "DEAL_BANKER_1" },
    { no: 6, name: "DEAL_PLAYER_1" },
    { no: 7, name: "DEAL_PLAYER_2" },
    { no: 8, name: "DEAL_PLAYER_3" },
    { no: 9, name: "OPEN_FOR_BETTING" },
    { no: 10, name: "CLOSE_THE_BETTING" },
    { no: 12, name: "SHOW_BANKER_1" },
    { no: 13, name: "SHOW_PLAYER_1" },
    { no: 14, name: "SHOW_PLAYER_2" },
    { no: 15, name: "SHOW_PLAYER_3" },
    { no: 24, name: "PITBOSS_MODIFY_BANKER_1" },
    { no: 25, name: "PITBOSS_MODIFY_PLAYER_1" },
    { no: 26, name: "PITBOSS_MODIFY_PLAYER_2" },
    { no: 27, name: "PITBOSS_MODIFY_PLAYER_3" },
]);
/**
 * 座位功能代碼
 *
 * @generated from enum games.bullfight.Seat
 */
export var Seat;
(function (Seat) {
    /**
     * 未指定
     *
     * @generated from enum value: SEAT_UNSPECIFIED = 0;
     */
    Seat[Seat["SEAT_UNSPECIFIED"] = 0] = "SEAT_UNSPECIFIED";
    /**
     * 起始牌
     *
     * @generated from enum value: FISRTCARD = 1;
     */
    Seat[Seat["FISRTCARD"] = 1] = "FISRTCARD";
    /**
     * 莊家
     *
     * @generated from enum value: BANKER = 2;
     */
    Seat[Seat["BANKER"] = 2] = "BANKER";
    /**
     * 玩家1
     *
     * @generated from enum value: PLAYER1 = 3;
     */
    Seat[Seat["PLAYER1"] = 3] = "PLAYER1";
    /**
     * 玩家2
     *
     * @generated from enum value: PLAYER2 = 4;
     */
    Seat[Seat["PLAYER2"] = 4] = "PLAYER2";
    /**
     * 玩家3
     *
     * @generated from enum value: PLAYER3 = 5;
     */
    Seat[Seat["PLAYER3"] = 5] = "PLAYER3";
    /**
     * Dealer
     *
     * @generated from enum value: DEALER = 6;
     */
    Seat[Seat["DEALER"] = 6] = "DEALER";
    /**
     * Pitboss
     *
     * @generated from enum value: PITBOSS = 9;
     */
    Seat[Seat["PITBOSS"] = 9] = "PITBOSS";
})(Seat || (Seat = {}));
// Retrieve enum metadata with: proto3.getEnumType(Seat)
proto3.util.setEnumType(Seat, "games.bullfight.Seat", [
    { no: 0, name: "SEAT_UNSPECIFIED" },
    { no: 1, name: "FISRTCARD" },
    { no: 2, name: "BANKER" },
    { no: 3, name: "PLAYER1" },
    { no: 4, name: "PLAYER2" },
    { no: 5, name: "PLAYER3" },
    { no: 6, name: "DEALER" },
    { no: 9, name: "PITBOSS" },
]);
/**
 * 結果紀錄類型代碼
 *
 * @generated from enum games.bullfight.ResultRecordType
 */
export var ResultRecordType;
(function (ResultRecordType) {
    /**
     * 未指定
     *
     * @generated from enum value: RESULT_RECORD_TYPE_UNSPECIFIED = 0;
     */
    ResultRecordType[ResultRecordType["RESULT_RECORD_TYPE_UNSPECIFIED"] = 0] = "RESULT_RECORD_TYPE_UNSPECIFIED";
    /**
     * 遊戲局結束
     *
     * @generated from enum value: ROUND_FINISH = 1;
     */
    ResultRecordType[ResultRecordType["ROUND_FINISH"] = 1] = "ROUND_FINISH";
    /**
     * Pitboss 修正
     *
     * @generated from enum value: PITBOSS_MODIFY_RESULT = 2;
     */
    ResultRecordType[ResultRecordType["PITBOSS_MODIFY_RESULT"] = 2] = "PITBOSS_MODIFY_RESULT";
})(ResultRecordType || (ResultRecordType = {}));
// Retrieve enum metadata with: proto3.getEnumType(ResultRecordType)
proto3.util.setEnumType(ResultRecordType, "games.bullfight.ResultRecordType", [
    { no: 0, name: "RESULT_RECORD_TYPE_UNSPECIFIED" },
    { no: 1, name: "ROUND_FINISH" },
    { no: 2, name: "PITBOSS_MODIFY_RESULT" },
]);
/**
 * 取消原因
 *
 * @generated from enum games.bullfight.CancelReason
 */
export var CancelReason;
(function (CancelReason) {
    /**
     * 未指定，沒有取消
     *
     * @generated from enum value: CANCEL_REASON_UNSPECIFIED = 0;
     */
    CancelReason[CancelReason["CANCEL_REASON_UNSPECIFIED"] = 0] = "CANCEL_REASON_UNSPECIFIED";
    /**
     * 取消說明原因
     *
     * @generated from enum value: NO_REASON = 1;
     */
    CancelReason[CancelReason["NO_REASON"] = 1] = "NO_REASON";
})(CancelReason || (CancelReason = {}));
// Retrieve enum metadata with: proto3.getEnumType(CancelReason)
proto3.util.setEnumType(CancelReason, "games.bullfight.CancelReason", [
    { no: 0, name: "CANCEL_REASON_UNSPECIFIED" },
    { no: 1, name: "NO_REASON" },
]);