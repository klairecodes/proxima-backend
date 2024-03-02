// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: protos/proxima.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package proxima;

@kotlin.jvm.JvmName("-initializeuser")
public inline fun user(block: proxima.UserKt.Dsl.() -> kotlin.Unit): proxima.Proxima.User =
  proxima.UserKt.Dsl._create(proxima.Proxima.User.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `proxima.User`
 */
public object UserKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: proxima.Proxima.User.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: proxima.Proxima.User.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): proxima.Proxima.User = _builder.build()

    /**
     * `int32 uid = 1;`
     */
    public var uid: kotlin.Int
      @JvmName("getUid")
      get() = _builder.getUid()
      @JvmName("setUid")
      set(value) {
        _builder.setUid(value)
      }
    /**
     * `int32 uid = 1;`
     */
    public fun clearUid() {
      _builder.clearUid()
    }

    /**
     * `string name = 2;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * `string name = 2;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * `string email = 3;`
     */
    public var email: kotlin.String
      @JvmName("getEmail")
      get() = _builder.getEmail()
      @JvmName("setEmail")
      set(value) {
        _builder.setEmail(value)
      }
    /**
     * `string email = 3;`
     */
    public fun clearEmail() {
      _builder.clearEmail()
    }

    /**
     * `string username = 4;`
     */
    public var username: kotlin.String
      @JvmName("getUsername")
      get() = _builder.getUsername()
      @JvmName("setUsername")
      set(value) {
        _builder.setUsername(value)
      }
    /**
     * `string username = 4;`
     */
    public fun clearUsername() {
      _builder.clearUsername()
    }

    /**
     * `string pronouns = 5;`
     */
    public var pronouns: kotlin.String
      @JvmName("getPronouns")
      get() = _builder.getPronouns()
      @JvmName("setPronouns")
      set(value) {
        _builder.setPronouns(value)
      }
    /**
     * `string pronouns = 5;`
     */
    public fun clearPronouns() {
      _builder.clearPronouns()
    }

    /**
     * ```
     * password
     * ```
     *
     * `string secret = 6;`
     */
    public var secret: kotlin.String
      @JvmName("getSecret")
      get() = _builder.getSecret()
      @JvmName("setSecret")
      set(value) {
        _builder.setSecret(value)
      }
    /**
     * ```
     * password
     * ```
     *
     * `string secret = 6;`
     */
    public fun clearSecret() {
      _builder.clearSecret()
    }

    /**
     * `.proxima.User.Visibility status = 7;`
     */
    public var status: proxima.Proxima.User.Visibility
      @JvmName("getStatus")
      get() = _builder.getStatus()
      @JvmName("setStatus")
      set(value) {
        _builder.setStatus(value)
      }
    public var statusValue: kotlin.Int
      @JvmName("getStatusValue")
      get() = _builder.getStatusValue()
      @JvmName("setStatusValue")
      set(value) {
        _builder.setStatusValue(value)
      }
    /**
     * `.proxima.User.Visibility status = 7;`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FriendsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .proxima.User friends = 8;`
     */
     public val friends: com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFriendsList()
      )
    /**
     * `repeated .proxima.User friends = 8;`
     * @param value The friends to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFriends")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.add(value: proxima.Proxima.User) {
      _builder.addFriends(value)
    }
    /**
     * `repeated .proxima.User friends = 8;`
     * @param value The friends to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFriends")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.plusAssign(value: proxima.Proxima.User) {
      add(value)
    }
    /**
     * `repeated .proxima.User friends = 8;`
     * @param values The friends to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFriends")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.addAll(values: kotlin.collections.Iterable<proxima.Proxima.User>) {
      _builder.addAllFriends(values)
    }
    /**
     * `repeated .proxima.User friends = 8;`
     * @param values The friends to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFriends")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.plusAssign(values: kotlin.collections.Iterable<proxima.Proxima.User>) {
      addAll(values)
    }
    /**
     * `repeated .proxima.User friends = 8;`
     * @param index The index to set the value at.
     * @param value The friends to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFriends")
    public operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.set(index: kotlin.Int, value: proxima.Proxima.User) {
      _builder.setFriends(index, value)
    }
    /**
     * `repeated .proxima.User friends = 8;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFriends")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, FriendsProxy>.clear() {
      _builder.clearFriends()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BlockedProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .proxima.User blocked = 9;`
     */
     public val blocked: com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getBlockedList()
      )
    /**
     * `repeated .proxima.User blocked = 9;`
     * @param value The blocked to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addBlocked")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.add(value: proxima.Proxima.User) {
      _builder.addBlocked(value)
    }
    /**
     * `repeated .proxima.User blocked = 9;`
     * @param value The blocked to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignBlocked")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.plusAssign(value: proxima.Proxima.User) {
      add(value)
    }
    /**
     * `repeated .proxima.User blocked = 9;`
     * @param values The blocked to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllBlocked")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.addAll(values: kotlin.collections.Iterable<proxima.Proxima.User>) {
      _builder.addAllBlocked(values)
    }
    /**
     * `repeated .proxima.User blocked = 9;`
     * @param values The blocked to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllBlocked")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.plusAssign(values: kotlin.collections.Iterable<proxima.Proxima.User>) {
      addAll(values)
    }
    /**
     * `repeated .proxima.User blocked = 9;`
     * @param index The index to set the value at.
     * @param value The blocked to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setBlocked")
    public operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.set(index: kotlin.Int, value: proxima.Proxima.User) {
      _builder.setBlocked(index, value)
    }
    /**
     * `repeated .proxima.User blocked = 9;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearBlocked")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.User, BlockedProxy>.clear() {
      _builder.clearBlocked()
    }


    /**
     * `.google.protobuf.Timestamp create_time = 10;`
     */
    public var createTime: com.google.protobuf.Timestamp
      @JvmName("getCreateTime")
      get() = _builder.getCreateTime()
      @JvmName("setCreateTime")
      set(value) {
        _builder.setCreateTime(value)
      }
    /**
     * `.google.protobuf.Timestamp create_time = 10;`
     */
    public fun clearCreateTime() {
      _builder.clearCreateTime()
    }
    /**
     * `.google.protobuf.Timestamp create_time = 10;`
     * @return Whether the createTime field is set.
     */
    public fun hasCreateTime(): kotlin.Boolean {
      return _builder.hasCreateTime()
    }

    /**
     * `.google.protobuf.Timestamp update_time = 11;`
     */
    public var updateTime: com.google.protobuf.Timestamp
      @JvmName("getUpdateTime")
      get() = _builder.getUpdateTime()
      @JvmName("setUpdateTime")
      set(value) {
        _builder.setUpdateTime(value)
      }
    /**
     * `.google.protobuf.Timestamp update_time = 11;`
     */
    public fun clearUpdateTime() {
      _builder.clearUpdateTime()
    }
    /**
     * `.google.protobuf.Timestamp update_time = 11;`
     * @return Whether the updateTime field is set.
     */
    public fun hasUpdateTime(): kotlin.Boolean {
      return _builder.hasUpdateTime()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OrbitProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     */
     public val orbit: com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOrbitList()
      )
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     * @param value The orbit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOrbit")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.add(value: proxima.Proxima.Ping) {
      _builder.addOrbit(value)
    }
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     * @param value The orbit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOrbit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.plusAssign(value: proxima.Proxima.Ping) {
      add(value)
    }
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     * @param values The orbit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOrbit")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.addAll(values: kotlin.collections.Iterable<proxima.Proxima.Ping>) {
      _builder.addAllOrbit(values)
    }
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     * @param values The orbit to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOrbit")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.plusAssign(values: kotlin.collections.Iterable<proxima.Proxima.Ping>) {
      addAll(values)
    }
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     * @param index The index to set the value at.
     * @param value The orbit to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOrbit")
    public operator fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.set(index: kotlin.Int, value: proxima.Proxima.Ping) {
      _builder.setOrbit(index, value)
    }
    /**
     * ```
     * current pings that have hit you
     * ```
     *
     * `repeated .proxima.Ping orbit = 12;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOrbit")
    public fun com.google.protobuf.kotlin.DslList<proxima.Proxima.Ping, OrbitProxy>.clear() {
      _builder.clearOrbit()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun proxima.Proxima.User.copy(block: `proxima`.UserKt.Dsl.() -> kotlin.Unit): proxima.Proxima.User =
  `proxima`.UserKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val proxima.Proxima.UserOrBuilder.createTimeOrNull: com.google.protobuf.Timestamp?
  get() = if (hasCreateTime()) getCreateTime() else null

public val proxima.Proxima.UserOrBuilder.updateTimeOrNull: com.google.protobuf.Timestamp?
  get() = if (hasUpdateTime()) getUpdateTime() else null

