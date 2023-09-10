// @generated by protoc-gen-es v1.3.1 with parameter "target=ts,import_extension=none"
// @generated from file games/lottery/record.proto (package games.lottery, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3, protoInt64 } from "@bufbuild/protobuf";

/**
 * *
 * The state of the game flow
 *
 * @generated from enum games.lottery.GameState
 */
export enum GameState {
  /**
   * Idle
   *
   * @generated from enum value: STATE_IDLE = 0;
   */
  STATE_IDLE = 0,

  /**
   * Game Starting
   *
   * @generated from enum value: STATE_START = 1;
   */
  STATE_START = 1,

  /**
   * Counuter Started
   *
   * @generated from enum value: STATE_COUNTER_START = 2;
   */
  STATE_COUNTER_START = 2,

  /**
   * Wait for input
   *
   * @generated from enum value: STATE_INPUT = 3;
   */
  STATE_INPUT = 3,

  /**
   * Game Ended
   *
   * @generated from enum value: STATE_END = 7;
   */
  STATE_END = 7,

  /**
   * Game Ended
   *
   * @generated from enum value: STATE_CONFIRM = 8;
   */
  STATE_CONFIRM = 8,
}
// Retrieve enum metadata with: proto3.getEnumType(GameState)
proto3.util.setEnumType(GameState, "games.lottery.GameState", [
  { no: 0, name: "STATE_IDLE" },
  { no: 1, name: "STATE_START" },
  { no: 2, name: "STATE_COUNTER_START" },
  { no: 3, name: "STATE_INPUT" },
  { no: 7, name: "STATE_END" },
  { no: 8, name: "STATE_CONFIRM" },
]);

/**
 * *
 * The status fo the current game.
 *
 * @generated from message games.lottery.GameStatus
 */
export class GameStatus extends Message<GameStatus> {
  /**
   * Unique tableid
   *
   * @generated from field: string sessionID = 1;
   */
  sessionID = "";

  /**
   * Unique session for the game
   *
   * @generated from field: string gameRoundID = 2;
   */
  gameRoundID = "";

  /**
   * Unique tableid
   *
   * @generated from field: string tableID = 3;
   */
  tableID = "";

  /**
   * State of the game
   *
   * @generated from field: games.lottery.GameState state = 4;
   */
  state = GameState.STATE_IDLE;

  /**
   * Time when game start
   *
   * @generated from field: int64 startTime = 5;
   */
  startTime = protoInt64.zero;

  /**
   * Shoe ID
   *
   * @generated from field: string shoeID = 6;
   */
  shoeID = "";

  /**
   * Value of the ball 1
   *
   * @generated from field: int32 ball1 = 10;
   */
  ball1 = 0;

  /**
   * Value of the ball 2
   *
   * @generated from field: int32 ball2 = 11;
   */
  ball2 = 0;

  /**
   * Value of the ball 3
   *
   * @generated from field: int32 ball3 = 12;
   */
  ball3 = 0;

  /**
   * Value of the ball 4
   *
   * @generated from field: int32 ball4 = 13;
   */
  ball4 = 0;

  /**
   * Value of the ball 5
   *
   * @generated from field: int32 ball5 = 14;
   */
  ball5 = 0;

  /**
   * Card slot Banker 1
   *
   * @generated from field: string a1 = 15;
   */
  a1 = "";

  /**
   * Card slot Banker 2
   *
   * @generated from field: string a2 = 16;
   */
  a2 = "";

  /**
   * Card slot Player 1
   *
   * @generated from field: string b1 = 17;
   */
  b1 = "";

  /**
   * Card slot Player 2
   *
   * @generated from field: string b2 = 18;
   */
  b2 = "";

  /**
   * Result of banker
   *
   * @generated from field: bool wina = 19;
   */
  wina = false;

  /**
   * Result of player
   *
   * @generated from field: bool winb = 20;
   */
  winb = false;

  /**
   * Coundown value
   *
   * @generated from field: int32 countdown = 21;
   */
  countdown = 0;

  /**
   * Player Point
   *
   * @generated from field: int32 playerPoint = 22;
   */
  playerPoint = 0;

  /**
   * Banker Point
   *
   * @generated from field: int32 bankerPoint = 23;
   */
  bankerPoint = 0;

  /**
   * Banker Pair -1=unknown 0=false 1=true
   *
   * @generated from field: int32 isBankerPair = 41;
   */
  isBankerPair = 0;

  /**
   * Player Pair-1=unknown 0=false 1=true
   *
   * @generated from field: int32 isPlayerPair = 42;
   */
  isPlayerPair = 0;

  /**
   * Lucky Number and payout ratio
   *
   * @generated from field: map<string, int32> lucky = 150;
   */
  lucky: { [key: string]: number } = {};

  constructor(data?: PartialMessage<GameStatus>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "games.lottery.GameStatus";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "sessionID", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "gameRoundID", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "tableID", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "state", kind: "enum", T: proto3.getEnumType(GameState) },
    { no: 5, name: "startTime", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
    { no: 6, name: "shoeID", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 10, name: "ball1", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 11, name: "ball2", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 12, name: "ball3", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 13, name: "ball4", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 14, name: "ball5", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 15, name: "a1", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 16, name: "a2", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 17, name: "b1", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 18, name: "b2", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 19, name: "wina", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
    { no: 20, name: "winb", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
    { no: 21, name: "countdown", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 22, name: "playerPoint", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 23, name: "bankerPoint", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 41, name: "isBankerPair", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 42, name: "isPlayerPair", kind: "scalar", T: 5 /* ScalarType.INT32 */ },
    { no: 150, name: "lucky", kind: "map", K: 9 /* ScalarType.STRING */, V: {kind: "scalar", T: 5 /* ScalarType.INT32 */} },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): GameStatus {
    return new GameStatus().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): GameStatus {
    return new GameStatus().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): GameStatus {
    return new GameStatus().fromJsonString(jsonString, options);
  }

  static equals(a: GameStatus | PlainMessage<GameStatus> | undefined, b: GameStatus | PlainMessage<GameStatus> | undefined): boolean {
    return proto3.util.equals(GameStatus, a, b);
  }
}

