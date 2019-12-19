/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/dialogflow/v2/entity_type"
          + ".proto\022\032google.cloud.dialogflow.v2\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032#google/lo"
          + "ngrunning/operations.proto\032\033google/proto"
          + "buf/empty.proto\032 google/protobuf/field_m"
          + "ask.proto\"\370\004\n\nEntityType\022\014\n\004name\030\001 \001(\t\022\031"
          + "\n\014display_name\030\002 \001(\tB\003\340A\002\022>\n\004kind\030\003 \001(\0162"
          + "+.google.cloud.dialogflow.v2.EntityType."
          + "KindB\003\340A\002\022Z\n\023auto_expansion_mode\030\004 \001(\01628"
          + ".google.cloud.dialogflow.v2.EntityType.A"
          + "utoExpansionModeB\003\340A\001\022D\n\010entities\030\006 \003(\0132"
          + "-.google.cloud.dialogflow.v2.EntityType."
          + "EntityB\003\340A\001\022$\n\027enable_fuzzy_extraction\030\007"
          + " \001(\010B\003\340A\001\0323\n\006Entity\022\022\n\005value\030\001 \001(\tB\003\340A\002\022"
          + "\025\n\010synonyms\030\002 \003(\tB\003\340A\002\"J\n\004Kind\022\024\n\020KIND_U"
          + "NSPECIFIED\020\000\022\014\n\010KIND_MAP\020\001\022\r\n\tKIND_LIST\020"
          + "\002\022\017\n\013KIND_REGEXP\020\003\"Y\n\021AutoExpansionMode\022"
          + "#\n\037AUTO_EXPANSION_MODE_UNSPECIFIED\020\000\022\037\n\033"
          + "AUTO_EXPANSION_MODE_DEFAULT\020\001:]\352AZ\n$dial"
          + "ogflow.googleapis.com/EntityType\0222projec"
          + "ts/{project}/agent/entityTypes/{entity_t"
          + "ype}\"\236\001\n\026ListEntityTypesRequest\0227\n\006paren"
          + "t\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.c"
          + "om/Agent\022\032\n\rlanguage_code\030\002 \001(\tB\003\340A\001\022\026\n\t"
          + "page_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_token\030\004 \001(\t"
          + "B\003\340A\001\"p\n\027ListEntityTypesResponse\022<\n\014enti"
          + "ty_types\030\001 \003(\0132&.google.cloud.dialogflow"
          + ".v2.EntityType\022\027\n\017next_page_token\030\002 \001(\t\""
          + "n\n\024GetEntityTypeRequest\022:\n\004name\030\001 \001(\tB,\340"
          + "A\002\372A&\n$dialogflow.googleapis.com/EntityT"
          + "ype\022\032\n\rlanguage_code\030\002 \001(\tB\003\340A\001\"\260\001\n\027Crea"
          + "teEntityTypeRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002"
          + "\372A!\n\037dialogflow.googleapis.com/Agent\022@\n\013"
          + "entity_type\030\002 \001(\0132&.google.cloud.dialogf"
          + "low.v2.EntityTypeB\003\340A\002\022\032\n\rlanguage_code\030"
          + "\003 \001(\tB\003\340A\001\"\255\001\n\027UpdateEntityTypeRequest\022@"
          + "\n\013entity_type\030\001 \001(\0132&.google.cloud.dialo"
          + "gflow.v2.EntityTypeB\003\340A\002\022\032\n\rlanguage_cod"
          + "e\030\002 \001(\tB\003\340A\001\0224\n\013update_mask\030\003 \001(\0132\032.goog"
          + "le.protobuf.FieldMaskB\003\340A\001\"U\n\027DeleteEnti"
          + "tyTypeRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dia"
          + "logflow.googleapis.com/EntityType\"\261\002\n\035Ba"
          + "tchUpdateEntityTypesRequest\0227\n\006parent\030\001 "
          + "\001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.com/A"
          + "gent\022\037\n\025entity_type_batch_uri\030\002 \001(\tH\000\022O\n"
          + "\030entity_type_batch_inline\030\003 \001(\0132+.google"
          + ".cloud.dialogflow.v2.EntityTypeBatchH\000\022\032"
          + "\n\rlanguage_code\030\004 \001(\tB\003\340A\001\0224\n\013update_mas"
          + "k\030\005 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001"
          + "B\023\n\021entity_type_batch\"^\n\036BatchUpdateEnti"
          + "tyTypesResponse\022<\n\014entity_types\030\001 \003(\0132&."
          + "google.cloud.dialogflow.v2.EntityType\"x\n"
          + "\035BatchDeleteEntityTypesRequest\0227\n\006parent"
          + "\030\001 \001(\tB\'\340A\002\372A!\n\037dialogflow.googleapis.co"
          + "m/Agent\022\036\n\021entity_type_names\030\002 \003(\tB\003\340A\002\""
          + "\274\001\n\032BatchCreateEntitiesRequest\022<\n\006parent"
          + "\030\001 \001(\tB,\340A\002\372A&\n$dialogflow.googleapis.co"
          + "m/EntityType\022D\n\010entities\030\002 \003(\0132-.google."
          + "cloud.dialogflow.v2.EntityType.EntityB\003\340"
          + "A\002\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A\001\"\362\001\n\032Batch"
          + "UpdateEntitiesRequest\022<\n\006parent\030\001 \001(\tB,\340"
          + "A\002\372A&\n$dialogflow.googleapis.com/EntityT"
          + "ype\022D\n\010entities\030\002 \003(\0132-.google.cloud.dia"
          + "logflow.v2.EntityType.EntityB\003\340A\002\022\032\n\rlan"
          + "guage_code\030\003 \001(\tB\003\340A\001\0224\n\013update_mask\030\004 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\003\340A\001\"\222\001\n\032"
          + "BatchDeleteEntitiesRequest\022<\n\006parent\030\001 \001"
          + "(\tB,\340A\002\372A&\n$dialogflow.googleapis.com/En"
          + "tityType\022\032\n\rentity_values\030\002 \003(\tB\003\340A\002\022\032\n\r"
          + "language_code\030\003 \001(\tB\003\340A\001\"O\n\017EntityTypeBa"
          + "tch\022<\n\014entity_types\030\001 \003(\0132&.google.cloud"
          + ".dialogflow.v2.EntityType2\344\023\n\013EntityType"
          + "s\022\315\001\n\017ListEntityTypes\0222.google.cloud.dia"
          + "logflow.v2.ListEntityTypesRequest\0323.goog"
          + "le.cloud.dialogflow.v2.ListEntityTypesRe"
          + "sponse\"Q\202\323\344\223\002+\022)/v2/{parent=projects/*/a"
          + "gent}/entityTypes\332A\006parent\332A\024parent,lang"
          + "uage_code\022\270\001\n\rGetEntityType\0220.google.clo"
          + "ud.dialogflow.v2.GetEntityTypeRequest\032&."
          + "google.cloud.dialogflow.v2.EntityType\"M\202"
          + "\323\344\223\002+\022)/v2/{name=projects/*/agent/entity"
          + "Types/*}\332A\004name\332A\022name,language_code\022\347\001\n"
          + "\020CreateEntityType\0223.google.cloud.dialogf"
          + "low.v2.CreateEntityTypeRequest\032&.google."
          + "cloud.dialogflow.v2.EntityType\"v\202\323\344\223\0028\")"
          + "/v2/{parent=projects/*/agent}/entityType"
          + "s:\013entity_type\332A\022parent,entity_type\332A pa"
          + "rent,entity_type,language_code\022\345\001\n\020Updat"
          + "eEntityType\0223.google.cloud.dialogflow.v2"
          + ".UpdateEntityTypeRequest\032&.google.cloud."
          + "dialogflow.v2.EntityType\"t\202\323\344\223\002D25/v2/{e"
          + "ntity_type.name=projects/*/agent/entityT"
          + "ypes/*}:\013entity_type\332A\013entity_type\332A\031ent"
          + "ity_type,language_code\022\231\001\n\020DeleteEntityT"
          + "ype\0223.google.cloud.dialogflow.v2.DeleteE"
          + "ntityTypeRequest\032\026.google.protobuf.Empty"
          + "\"8\202\323\344\223\002+*)/v2/{name=projects/*/agent/ent"
          + "ityTypes/*}\332A\004name\022\213\002\n\026BatchUpdateEntity"
          + "Types\0229.google.cloud.dialogflow.v2.Batch"
          + "UpdateEntityTypesRequest\032\035.google.longru"
          + "nning.Operation\"\226\001\202\323\344\223\002:\"5/v2/{parent=pr"
          + "ojects/*/agent}/entityTypes:batchUpdate:"
          + "\001*\312AS\n9google.cloud.dialogflow.v2.BatchU"
          + "pdateEntityTypesResponse\022\026google.protobu"
          + "f.Struct\022\346\001\n\026BatchDeleteEntityTypes\0229.go"
          + "ogle.cloud.dialogflow.v2.BatchDeleteEnti"
          + "tyTypesRequest\032\035.google.longrunning.Oper"
          + "ation\"r\202\323\344\223\002:\"5/v2/{parent=projects/*/ag"
          + "ent}/entityTypes:batchDelete:\001*\312A/\n\025goog"
          + "le.protobuf.Empty\022\026google.protobuf.Struc"
          + "t\022\236\002\n\023BatchCreateEntities\0226.google.cloud"
          + ".dialogflow.v2.BatchCreateEntitiesReques"
          + "t\032\035.google.longrunning.Operation\"\257\001\202\323\344\223\002"
          + "E\"@/v2/{parent=projects/*/agent/entityTy"
          + "pes/*}/entities:batchCreate:\001*\332A\017parent,"
          + "entities\332A\035parent,entities,language_code"
          + "\312A/\n\025google.protobuf.Empty\022\026google.proto"
          + "buf.Struct\022\236\002\n\023BatchUpdateEntities\0226.goo"
          + "gle.cloud.dialogflow.v2.BatchUpdateEntit"
          + "iesRequest\032\035.google.longrunning.Operatio"
          + "n\"\257\001\202\323\344\223\002E\"@/v2/{parent=projects/*/agent"
          + "/entityTypes/*}/entities:batchUpdate:\001*\332"
          + "A\017parent,entities\332A\035parent,entities,lang"
          + "uage_code\312A/\n\025google.protobuf.Empty\022\026goo"
          + "gle.protobuf.Struct\022\250\002\n\023BatchDeleteEntit"
          + "ies\0226.google.cloud.dialogflow.v2.BatchDe"
          + "leteEntitiesRequest\032\035.google.longrunning"
          + ".Operation\"\271\001\202\323\344\223\002E\"@/v2/{parent=project"
          + "s/*/agent/entityTypes/*}/entities:batchD"
          + "elete:\001*\332A\024parent,entity_values\332A\"parent"
          + ",entity_values,language_code\312A/\n\025google."
          + "protobuf.Empty\022\026google.protobuf.Struct\032x"
          + "\312A\031dialogflow.googleapis.com\322AYhttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/dialogflow"
          + "B\236\001\n\036com.google.cloud.dialogflow.v2B\017Ent"
          + "ityTypeProtoP\001ZDgoogle.golang.org/genpro"
          + "to/googleapis/cloud/dialogflow/v2;dialog"
          + "flow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V"
          + "2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "EnableFuzzyExtraction",
            });
    internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_v2_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypeBatchUri",
              "EntityTypeBatchInline",
              "LanguageCode",
              "UpdateMask",
              "EntityTypeBatch",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityTypeNames",
            });
    internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityValues", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
