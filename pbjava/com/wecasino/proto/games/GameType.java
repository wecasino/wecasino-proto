// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: games/games.proto

// Protobuf Java Version: 3.25.3
package com.wecasino.proto.games;

/**
 * <pre>
 * GameType 
 * 遊戲類型
 * </pre>
 *
 * Protobuf enum {@code games.GameType}
 */
public enum GameType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_TYPE_UNSPECIFIED = 0;</code>
   */
  GAME_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * 百家樂
   * </pre>
   *
   * <code>BACCARAT = 16;</code>
   */
  BACCARAT(16),
  /**
   * <pre>
   * 龍虎鬥
   * </pre>
   *
   * <code>THEBIGBATTLE = 17;</code>
   */
  THEBIGBATTLE(17),
  /**
   * <pre>
   * 炸金花
   * </pre>
   *
   * <code>THREECARDS = 18;</code>
   */
  THREECARDS(18),
  /**
   * <pre>
   * 牛牛
   * </pre>
   *
   * <code>BULLFIGHT = 19;</code>
   */
  BULLFIGHT(19),
  /**
   * <pre>
   * 番攤
   * </pre>
   *
   * <code>FANTAN = 20;</code>
   */
  FANTAN(20),
  /**
   * <pre>
   * 骰寶
   * </pre>
   *
   * <code>SICBO = 32;</code>
   */
  SICBO(32),
  /**
   * <pre>
   * 色彩遊戲
   * </pre>
   *
   * <code>COLORGAME = 33;</code>
   */
  COLORGAME(33),
  /**
   * <pre>
   * 丟球遊戲
   * </pre>
   *
   * <code>DROPBALL = 34;</code>
   */
  DROPBALL(34),
  /**
   * <pre>
   * 輪盤
   * </pre>
   *
   * <code>ROULETTE = 36;</code>
   */
  ROULETTE(36),
  /**
   * <pre>
   * 幸運輪
   * </pre>
   *
   * <code>LUCKYWHEEL = 40;</code>
   */
  LUCKYWHEEL(40),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未指定
   * </pre>
   *
   * <code>GAME_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int GAME_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 百家樂
   * </pre>
   *
   * <code>BACCARAT = 16;</code>
   */
  public static final int BACCARAT_VALUE = 16;
  /**
   * <pre>
   * 龍虎鬥
   * </pre>
   *
   * <code>THEBIGBATTLE = 17;</code>
   */
  public static final int THEBIGBATTLE_VALUE = 17;
  /**
   * <pre>
   * 炸金花
   * </pre>
   *
   * <code>THREECARDS = 18;</code>
   */
  public static final int THREECARDS_VALUE = 18;
  /**
   * <pre>
   * 牛牛
   * </pre>
   *
   * <code>BULLFIGHT = 19;</code>
   */
  public static final int BULLFIGHT_VALUE = 19;
  /**
   * <pre>
   * 番攤
   * </pre>
   *
   * <code>FANTAN = 20;</code>
   */
  public static final int FANTAN_VALUE = 20;
  /**
   * <pre>
   * 骰寶
   * </pre>
   *
   * <code>SICBO = 32;</code>
   */
  public static final int SICBO_VALUE = 32;
  /**
   * <pre>
   * 色彩遊戲
   * </pre>
   *
   * <code>COLORGAME = 33;</code>
   */
  public static final int COLORGAME_VALUE = 33;
  /**
   * <pre>
   * 丟球遊戲
   * </pre>
   *
   * <code>DROPBALL = 34;</code>
   */
  public static final int DROPBALL_VALUE = 34;
  /**
   * <pre>
   * 輪盤
   * </pre>
   *
   * <code>ROULETTE = 36;</code>
   */
  public static final int ROULETTE_VALUE = 36;
  /**
   * <pre>
   * 幸運輪
   * </pre>
   *
   * <code>LUCKYWHEEL = 40;</code>
   */
  public static final int LUCKYWHEEL_VALUE = 40;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GameType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameType forNumber(int value) {
    switch (value) {
      case 0: return GAME_TYPE_UNSPECIFIED;
      case 16: return BACCARAT;
      case 17: return THEBIGBATTLE;
      case 18: return THREECARDS;
      case 19: return BULLFIGHT;
      case 20: return FANTAN;
      case 32: return SICBO;
      case 33: return COLORGAME;
      case 34: return DROPBALL;
      case 36: return ROULETTE;
      case 40: return LUCKYWHEEL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameType>() {
          public GameType findValueByNumber(int number) {
            return GameType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wecasino.proto.games.GamesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameType[] VALUES = values();

  public static GameType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GameType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:games.GameType)
}

