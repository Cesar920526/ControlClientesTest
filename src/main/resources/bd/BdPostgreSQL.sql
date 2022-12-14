PGDMP     !    +                z         	   LoginImsy    15.1    15.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16565 	   LoginImsy    DATABASE     ?   CREATE DATABASE "LoginImsy" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE "LoginImsy";
                postgres    false            ?            1259    16691    persona    TABLE     	  CREATE TABLE public.persona (
    id_persona integer NOT NULL,
    nombre character varying(50) NOT NULL,
    apellido character varying(50) NOT NULL,
    email character varying(50) NOT NULL,
    telefono character varying(50) NOT NULL,
    saldo numeric(20,4)
);
    DROP TABLE public.persona;
       public         heap    postgres    false            ?            1259    16690    persona_id_persona_seq    SEQUENCE     ?   CREATE SEQUENCE public.persona_id_persona_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.persona_id_persona_seq;
       public          postgres    false    215                       0    0    persona_id_persona_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.persona_id_persona_seq OWNED BY public.persona.id_persona;
          public          postgres    false    214            ?            1259    16706    rol    TABLE     ?   CREATE TABLE public.rol (
    id_rol integer NOT NULL,
    nombre character varying(45) NOT NULL,
    id_usuario integer NOT NULL
);
    DROP TABLE public.rol;
       public         heap    postgres    false            ?            1259    16705    rol_id_rol_seq    SEQUENCE     ?   CREATE SEQUENCE public.rol_id_rol_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.rol_id_rol_seq;
       public          postgres    false    219                       0    0    rol_id_rol_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.rol_id_rol_seq OWNED BY public.rol.id_rol;
          public          postgres    false    218            ?            1259    16699    usuario    TABLE     ?   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    username character varying(45) NOT NULL,
    password character varying(128) NOT NULL
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            ?            1259    16698    usuario_id_usuario_seq    SEQUENCE     ?   CREATE SEQUENCE public.usuario_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.usuario_id_usuario_seq;
       public          postgres    false    217                       0    0    usuario_id_usuario_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.usuario_id_usuario_seq OWNED BY public.usuario.id_usuario;
          public          postgres    false    216            o           2604    16694    persona id_persona    DEFAULT     x   ALTER TABLE ONLY public.persona ALTER COLUMN id_persona SET DEFAULT nextval('public.persona_id_persona_seq'::regclass);
 A   ALTER TABLE public.persona ALTER COLUMN id_persona DROP DEFAULT;
       public          postgres    false    215    214    215            q           2604    16709 
   rol id_rol    DEFAULT     h   ALTER TABLE ONLY public.rol ALTER COLUMN id_rol SET DEFAULT nextval('public.rol_id_rol_seq'::regclass);
 9   ALTER TABLE public.rol ALTER COLUMN id_rol DROP DEFAULT;
       public          postgres    false    219    218    219            p           2604    16702    usuario id_usuario    DEFAULT     x   ALTER TABLE ONLY public.usuario ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuario_id_usuario_seq'::regclass);
 A   ALTER TABLE public.usuario ALTER COLUMN id_usuario DROP DEFAULT;
       public          postgres    false    217    216    217                      0    16691    persona 
   TABLE DATA           W   COPY public.persona (id_persona, nombre, apellido, email, telefono, saldo) FROM stdin;
    public          postgres    false    215   ?                 0    16706    rol 
   TABLE DATA           9   COPY public.rol (id_rol, nombre, id_usuario) FROM stdin;
    public          postgres    false    219   h       
          0    16699    usuario 
   TABLE DATA           A   COPY public.usuario (id_usuario, username, password) FROM stdin;
    public          postgres    false    217   ?                  0    0    persona_id_persona_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.persona_id_persona_seq', 3, true);
          public          postgres    false    214                       0    0    rol_id_rol_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.rol_id_rol_seq', 3, true);
          public          postgres    false    218                       0    0    usuario_id_usuario_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 2, true);
          public          postgres    false    216            s           2606    16696    persona persona_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.persona
    ADD CONSTRAINT persona_pkey PRIMARY KEY (id_persona);
 >   ALTER TABLE ONLY public.persona DROP CONSTRAINT persona_pkey;
       public            postgres    false    215            w           2606    16711    rol rol_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_pkey PRIMARY KEY (id_rol);
 6   ALTER TABLE ONLY public.rol DROP CONSTRAINT rol_pkey;
       public            postgres    false    219            u           2606    16704    usuario usuario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public            postgres    false    217            x           2606    16712    rol rol_id_usuario_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario);
 A   ALTER TABLE ONLY public.rol DROP CONSTRAINT rol_id_usuario_fkey;
       public          postgres    false    219    217    3189               ?   x?u?=? E???y??l???ҩ??5m??)?,????j?R*???O?'_j??为?),?(>m?4߂????*e8Svk????>?	3??{??k???wJ?m??Uf?q???Lj)G?ǽ쁌?/uFR         )   x?3???q?wt????4?2?pC?]??<c$?W? ?
?      
   ?   x?5???   г|?g???:?
ge?h]4Rl?i??w?}???Rt?Ӳai{?M??ֲ??4???#U??HCw?)O??3V?
Ĳ??1???????Q.0?.?]W????qvH??`?W?;ڄ*|Q?7I?4??1?% ?%b+     