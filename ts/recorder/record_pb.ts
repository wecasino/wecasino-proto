// @generated by protoc-gen-es v1.1.0 with parameter "target=ts,import_extension=none"
// @generated from file recorder/record.proto (package recorder, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Any, Message, proto3, protoInt64, Timestamp } from "@bufbuild/protobuf";

/**
 * 動作類型
 *
 * @generated from enum recorder.StepActionType
 */
export enum StepActionType {
  /**
   * 未指定
   *
   * @generated from enum value: STEP_ACTION_TYPE_UNSPECIFIED = 0;
   */
  STEP_ACTION_TYPE_UNSPECIFIED = 0,

  /**
   * 派發資源
   *
   * @generated from enum value: ADD = 1;
   */
  ADD = 1,

  /**
   * 設定指定資源
   *
   * @generated from enum value: SET = 2;
   */
  SET = 2,

  /**
   * 改寫全部資源;
   *
   * @generated from enum value: SETALL = 3;
   */
  SETALL = 3,

  /**
   * 將資源從場上移除
   *
   * @generated from enum value: REMOVE = 4;
   */
  REMOVE = 4,

  /**
   * 讀取卡牌資料
   *
   * @generated from enum value: READ = 5;
   */
  READ = 5,

  /**
   * 讀卡但不可見
   *
   * @generated from enum value: READ_UNVISIBLE = 6;
   */
  READ_UNVISIBLE = 6,

  /**
   * 移轉資源
   *
   * @generated from enum value: TRANSFER = 7;
   */
  TRANSFER = 7,

  /**
   * 卡片正反面
   *
   * @generated from enum value: VISIBLE = 8;
   */
  VISIBLE = 8,

  /**
   * 卡牌狀態改變
   *
   * @generated from enum value: STATUS = 9;
   */
  STATUS = 9,

  /**
   * 此步驟不須修改資源
   *
   * @generated from enum value: NONE = 10;
   */
  NONE = 10,
}
// Retrieve enum metadata with: proto3.getEnumType(StepActionType)
proto3.util.setEnumType(StepActionType, "recorder.StepActionType", [
  { no: 0, name: "STEP_ACTION_TYPE_UNSPECIFIED" },
  { no: 1, name: "ADD" },
  { no: 2, name: "SET" },
  { no: 3, name: "SETALL" },
  { no: 4, name: "REMOVE" },
  { no: 5, name: "READ" },
  { no: 6, name: "READ_UNVISIBLE" },
  { no: 7, name: "TRANSFER" },
  { no: 8, name: "VISIBLE" },
  { no: 9, name: "STATUS" },
  { no: 10, name: "NONE" },
]);

/**
 * 卡牌，代表在此局中使用的各類物品
 *
 * @generated from message recorder.Card
 */
export class Card extends Message<Card> {
  /**
   * 卡牌代碼
   *
   * @generated from field: int32 code = 1;
   */
  code = 0;

  /**
   * 卡牌ID：牌唯一碼，同ID表示同一張實體牌。不使用此欄位填0。
   *
   * @generated from field: string id = 2;
   */
  id = "";

  /**
   * 驗整
   *
   * @generated from field: string secret = 3;
   */
  secret = "";

  /**
   * 順序
   *
   * @generated from field: int64 index = 4;
   */
  index = protoInt64.zero;

  /**
   * 可見
   *
   * @generated from field: bool visible = 5;
   */
  visible = false;

  /**
   * 橫放、直放...
   *
   * @generated from field: int32 status = 6;
   */
  status = 0;

  constructor(data?: PartialMessage<Card>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.Card";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "code", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 2, name: "id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "secret", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "index", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
    { no: 5, name: "visible", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
    { no: 6, name: "status", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Card {
    return new Card().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Card {
    return new Card().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Card {
    return new Card().fromJsonString(jsonString, options);
  }

  static equals(a: Card | PlainMessage<Card> | undefined, b: Card | PlainMessage<Card> | undefined): boolean {
    return proto3.util.equals(Card, a, b);
  }
}

/**
 * 卡牌列表
 *
 * @generated from message recorder.CardList
 */
export class CardList extends Message<CardList> {
  /**
   * @generated from field: repeated recorder.Card list = 1;
   */
  list: Card[] = [];

  constructor(data?: PartialMessage<CardList>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.CardList";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "list", kind: "message", T: Card, repeated: true },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CardList {
    return new CardList().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CardList {
    return new CardList().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CardList {
    return new CardList().fromJsonString(jsonString, options);
  }

  static equals(a: CardList | PlainMessage<CardList> | undefined, b: CardList | PlainMessage<CardList> | undefined): boolean {
    return proto3.util.equals(CardList, a, b);
  }
}

/**
 * 執行動作：對某些資源進行增、刪、移轉
 *
 * @generated from message recorder.StepAction
 */
export class StepAction extends Message<StepAction> {
  /**
   * 行為說明代碼：StepActionCode
   *
   * @generated from field: int32 code = 1;
   */
  code = 0;

  /**
   * 資源擁有座位。
   *
   * @generated from field: int32 source_seat = 3;
   */
  sourceSeat = 0;

  /**
   * 資源轉移目標座位。
   *
   * @generated from field: int32 target_seat = 4;
   */
  targetSeat = 0;

  /**
   * 目標卡牌資源
   * key: ResourceTypeCode, value: 卡牌陣列
   *
   * @generated from field: map<int32, recorder.CardList> cards = 6;
   */
  cards: { [key: number]: CardList } = {};

  /**
   * 目標分數資源
   * key: ResourceTypeCode, value: 分數值。
   *
   * @generated from field: map<int32, int64> scores = 7;
   */
  scores: { [key: number]: bigint } = {};

  /**
   * 動作類型
   *
   * @generated from field: recorder.StepActionType type = 8;
   */
  type = StepActionType.STEP_ACTION_TYPE_UNSPECIFIED;

  /**
   * （可選）附加資料
   *
   * @generated from field: google.protobuf.Any data = 9;
   */
  data?: Any;

  constructor(data?: PartialMessage<StepAction>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.StepAction";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "code", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 3, name: "source_seat", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 4, name: "target_seat", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 6, name: "cards", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "message", T: CardList} },
    { no: 7, name: "scores", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "scalar", T: 3 /* ScalarType.INT64 */} },
    { no: 8, name: "type", kind: "enum", T: proto3.getEnumType(StepActionType) },
    { no: 9, name: "data", kind: "message", T: Any },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): StepAction {
    return new StepAction().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): StepAction {
    return new StepAction().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): StepAction {
    return new StepAction().fromJsonString(jsonString, options);
  }

  static equals(a: StepAction | PlainMessage<StepAction> | undefined, b: StepAction | PlainMessage<StepAction> | undefined): boolean {
    return proto3.util.equals(StepAction, a, b);
  }
}

/**
 * 遊戲步驟
 *
 * @generated from message recorder.Step
 */
export class Step extends Message<Step> {
  /**
   * 步驟代碼：StepCode
   *
   * @generated from field: int32 code = 1;
   */
  code = 0;

  /**
   * 玩家、執行者：SeatCode
   *
   * @generated from field: int32 seat = 3;
   */
  seat = 0;

  /**
   * 時間戳
   *
   * @generated from field: google.protobuf.Timestamp timestamp = 5;
   */
  timestamp?: Timestamp;

  /**
   * 執行動作
   *
   * @generated from field: repeated recorder.StepAction actions = 6;
   */
  actions: StepAction[] = [];

  /**
   * 執行錯誤
   *
   * @generated from field: string error = 8;
   */
  error = "";

  /**
   * 取消
   *
   * @generated from field: bool cancel = 9;
   */
  cancel = false;

  /**
   * 分配毫秒數
   *
   * @generated from field: int64 duration = 10;
   */
  duration = protoInt64.zero;

  constructor(data?: PartialMessage<Step>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.Step";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "code", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 3, name: "seat", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 5, name: "timestamp", kind: "message", T: Timestamp },
    { no: 6, name: "actions", kind: "message", T: StepAction, repeated: true },
    { no: 8, name: "error", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 9, name: "cancel", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
    { no: 10, name: "duration", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Step {
    return new Step().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Step {
    return new Step().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Step {
    return new Step().fromJsonString(jsonString, options);
  }

  static equals(a: Step | PlainMessage<Step> | undefined, b: Step | PlainMessage<Step> | undefined): boolean {
    return proto3.util.equals(Step, a, b);
  }
}

/**
 * 座位
 *
 * @generated from message recorder.Seat
 */
export class Seat extends Message<Seat> {
  /**
   * 座位功能代碼：SeatCode
   *
   * @generated from field: int32 code = 1;
   */
  code = 0;

  /**
   * 各類手牌
   * key: ResourceTypeCode, value: 卡牌陣列
   *
   * @generated from field: map<int32, recorder.CardList> cards = 6;
   */
  cards: { [key: number]: CardList } = {};

  /**
   * 各類手牌使用牌類型
   * key: ResourceTypeCode, value: CardTypeCode
   *
   * @generated from field: map<int32, int32> card_types = 7;
   */
  cardTypes: { [key: number]: number } = {};

  /**
   * 各類分數
   * key: ResourceTypeCode, value: 分數值。
   *
   * @generated from field: map<int32, int64> scores = 8;
   */
  scores: { [key: number]: bigint } = {};

  constructor(data?: PartialMessage<Seat>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.Seat";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "code", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 6, name: "cards", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "message", T: CardList} },
    { no: 7, name: "card_types", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "scalar", T: 5 /* ScalarType.INT32 */} },
    { no: 8, name: "scores", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "scalar", T: 3 /* ScalarType.INT64 */} },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Seat {
    return new Seat().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Seat {
    return new Seat().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Seat {
    return new Seat().fromJsonString(jsonString, options);
  }

  static equals(a: Seat | PlainMessage<Seat> | undefined, b: Seat | PlainMessage<Seat> | undefined): boolean {
    return proto3.util.equals(Seat, a, b);
  }
}

/**
 * 記錄各座位狀態
 *
 * @generated from message recorder.Result
 */
export class Result extends Message<Result> {
  /**
   * 判讀類型代碼：ResultRecordTypeCode
   *
   * @generated from field: int32 code = 1;
   */
  code = 0;

  /**
   * 紀錄者座位代碼
   *
   * @generated from field: int32 by_seat = 3;
   */
  bySeat = 0;

  /**
   * 時間戳
   *
   * @generated from field: google.protobuf.Timestamp timestamp = 5;
   */
  timestamp?: Timestamp;

  /**
   * 座位組
   * key: SeatCode, value: Seat
   *
   * @generated from field: map<int32, recorder.Seat> seats = 6;
   */
  seats: { [key: number]: Seat } = {};

  constructor(data?: PartialMessage<Result>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.Result";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "code", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 3, name: "by_seat", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 5, name: "timestamp", kind: "message", T: Timestamp },
    { no: 6, name: "seats", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "message", T: Seat} },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Result {
    return new Result().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Result {
    return new Result().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Result {
    return new Result().fromJsonString(jsonString, options);
  }

  static equals(a: Result | PlainMessage<Result> | undefined, b: Result | PlainMessage<Result> | undefined): boolean {
    return proto3.util.equals(Result, a, b);
  }
}

/**
 * 紀錄
 *
 * @generated from message recorder.RoundRecord
 */
export class RoundRecord extends Message<RoundRecord> {
  /**
   * 紀錄ID
   *
   * @generated from field: string id = 1;
   */
  id = "";

  /**
   * 遊戲代碼
   *
   * @generated from field: string game_code = 2;
   */
  gameCode = "";

  /**
   * 桌代碼
   *
   * @generated from field: string table_code = 3;
   */
  tableCode = "";

  /**
   * 局代碼
   *
   * @generated from field: string round_code = 4;
   */
  roundCode = "";

  /**
   * 使用洗牌ID
   *
   * @generated from field: string shuffle_code = 5;
   */
  shuffleCode = "";

  /**
   * 使用此洗牌第幾局，從1開始計算
   *
   * @generated from field: int64 shuffle_round = 6;
   */
  shuffleRound = protoInt64.zero;

  /**
   * 遊戲版本
   *
   * @generated from field: string game_version = 7;
   */
  gameVersion = "";

  /**
   * 座位組
   * key: SeatCode, value: Seat
   *
   * @generated from field: map<int32, recorder.Seat> seats = 8;
   */
  seats: { [key: number]: Seat } = {};

  /**
   * 玩家入座
   * key: SeatCode, value: 玩家code。
   *
   * @generated from field: map<int32, string> players = 9;
   */
  players: { [key: number]: string } = {};

  /**
   * 歷程
   *
   * @generated from field: repeated recorder.Step process = 10;
   */
  process: Step[] = [];

  /**
   * 判讀
   *
   * @generated from field: repeated recorder.Result results = 11;
   */
  results: Result[] = [];

  /**
   * 取消
   *
   * @generated from field: bool cancel = 12;
   */
  cancel = false;

  /**
   * 取消代碼：CancelReasonCode
   *
   * @generated from field: string cancel_code = 13;
   */
  cancelCode = "";

  /**
   * 取消備註
   *
   * @generated from field: string cancel_message = 14;
   */
  cancelMessage = "";

  /**
   * 標籤
   *
   * @generated from field: map<string, string> tags = 15;
   */
  tags: { [key: string]: string } = {};

  /**
   * 開始時間
   *
   * @generated from field: google.protobuf.Timestamp ts_start = 16;
   */
  tsStart?: Timestamp;

  /**
   * 結束時間
   *
   * @generated from field: google.protobuf.Timestamp ts_end = 17;
   */
  tsEnd?: Timestamp;

  constructor(data?: PartialMessage<RoundRecord>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "recorder.RoundRecord";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "game_code", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "table_code", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "round_code", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "shuffle_code", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 6, name: "shuffle_round", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
    { no: 7, name: "game_version", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 8, name: "seats", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "message", T: Seat} },
    { no: 9, name: "players", kind: "map", K: 5 /* ScalarType.INT32 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 10, name: "process", kind: "message", T: Step, repeated: true },
    { no: 11, name: "results", kind: "message", T: Result, repeated: true },
    { no: 12, name: "cancel", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
    { no: 13, name: "cancel_code", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 14, name: "cancel_message", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 15, name: "tags", kind: "map", K: 9 /* ScalarType.STRING */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 16, name: "ts_start", kind: "message", T: Timestamp },
    { no: 17, name: "ts_end", kind: "message", T: Timestamp },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): RoundRecord {
    return new RoundRecord().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): RoundRecord {
    return new RoundRecord().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): RoundRecord {
    return new RoundRecord().fromJsonString(jsonString, options);
  }

  static equals(a: RoundRecord | PlainMessage<RoundRecord> | undefined, b: RoundRecord | PlainMessage<RoundRecord> | undefined): boolean {
    return proto3.util.equals(RoundRecord, a, b);
  }
}

