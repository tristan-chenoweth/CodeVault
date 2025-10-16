module RubyCraft
  module World
    class Block
      attr_reader :id, :name, :solid, :transparent, :opaque, :semi_transparent, :breakable, :hardness,
      :drops, :blast_resistance, :flammability, :ignition, :burning_rate, :intended_tool, :luminance,
      :blocks_light, :blocks_movement, :block_state, :can_support, :replaceable, :moveable, :conductive,
      :valid_spawn, :water_logged, :full_block, :height, :width

      def initialize(id:, name:, solid: true, transparent: false, opaque: true, semi_transparent: false,
        breakable: true, hardness: 1.0, drops: nil, blast_resistance: 1.0, flammability: 0, ignition: 0,
        burning_rate: 0, intended_tool: nil, luminance: 0, blocks_light: true, blocks_movement: true,
        block_state: {}, can_support: true, replaceable: false, moveable: false, conductive: true, 
        valid_spawn: true, water_logged: false, full_block: true, height: 10, width: 10
        )

        @id = id
        @name = name
        @solid = solid
        @transparent = transparent
        @opaque = opaque
        @semi_transparent = semi_transparent
        @breakable = breakable
        @hardness = hardness
        @drops = drops || [name]
        @blast_resistance = blast_resistance
        @flammability = flammability
        @ignition = ignition
        @burning_rate = burning_rate
        @intended_tool = intended_tool
        @luminance = luminance
        @blocks_light = blocks_light
        @blocks_movement = blocks_movement
        @block_state = block_state
        @can_support = can_support
        @replaceable = replaceable
        @moveable = moveable
        @conductive = conductive
        @valid_spawn = valid_spawn
        @water_logged = water_logged
        @full_block = full_block
        @height = height
        @width = width
      end

      def break_block
        if breakable
          puts "#{name} broken! Drops: #{drops.join(', ')}"
          drops
        else
          puts "#{name} is unbreakable."
          []
        end
      end

      def to_s
        "#{name} (id: #{id})"
      end
    end
  end
end
